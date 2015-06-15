package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Fahrt;
import models.User;
import play.*;
import play.data.*;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    static Form<User> userForm = Form.form(User.class);
    static Form<Fahrt> fahrtForm = Form.form(Fahrt.class);

    public static Result index() {
        String name = "index";
        if (session("id") != null) {
            return ok(index.render(name, "eingeloggt"));
        }

        return ok(index.render(name, "ausgeloggt"));
    }

    public static Result impressum() {
        String name = "impressum";
        if (session("id") != null) {
            return ok(impressum.render(name, "eingeloggt"));
        }
        return ok(impressum.render(name, "ausgeloggt"));
    }

    public static Result login() {
        String name = "login";
        if (session("id") != null) {
            return redirect(routes.Application.index());
        }
        return ok(login.render(name, userForm, "ausgeloggt"));
    }

    public static Result registrierung() {
        String name = "registrierung";

        if (session("id") != null) {
            return redirect(routes.Application.index());
        }
        return ok(registrierung.render(name, userForm, "ausgeloggt"));

    }

    public static Result suche() {
        String name = "suche";
        List<Fahrt> fahrtList = new ArrayList<Fahrt>();
        if (session("id") != null) {
            return ok(suche.render(name, fahrtForm, "eingeloggt", fahrtList));
        }
        return ok(suche.render(name, fahrtForm, "ausgeloggt", fahrtList));
    }

    public static Result anlegen() {
        String name = "anlegen";
        if (session("id") != null) {
            return ok(anlegen.render(name, fahrtForm, "eingeloggt"));
        }
        return forbidden("403 - Forbidden!!! \n not logged in!");
    }

    public static Result registrieren() {
        Form<User> filledForm = userForm.bindFromRequest();
        if (filledForm.hasErrors()) {
            return badRequest(views.html.registrierung.render("registrierung", filledForm, "ausgeloggt"));
        } else {
            try {
            User.create(filledForm.get());
            return redirect(routes.Application.index());
            } catch (Exception e){
                return badRequest(views.html.registrierung.render("registrierung", filledForm, "ausgeloggt"));
            }
        }
    }

    public static Result einloggen() {
        Form<User> filledForm = userForm.bindFromRequest();
        if (!filledForm.hasErrors()) {
            if (User.login(filledForm.get().username, filledForm.get().passwort)) {
                session("id", filledForm.get().username);
                return redirect(routes.Application.index());
            }
        }
        return badRequest(views.html.login.render("login", userForm, "ausgeloggt"));

    }

    public static Result logout() {
        session().clear();
        return redirect(routes.Application.index());
    }

    public static Result fahrtAnlegen() {
        Form<Fahrt> filledForm = fahrtForm.bindFromRequest();
        if (filledForm.hasErrors()) {
            return badRequest(views.html.anlegen.render("anlegen", fahrtForm, "eingeloggt"));
        } else {
            Fahrt.create(filledForm.get(), "" + getNextId());
        }
        models.Fahrt.getInstance().notifyObservers();
        return redirect(routes.Application.index());
    }

    public static Result fahrtSuchen() {
        Socket socket = new Socket();
        socket.register();
        String id = "ausgeloggt";
        List<Fahrt> fahrtList = new ArrayList<Fahrt>();
        if (session("id") != null) {
            id = "eingeloggt";
        }

        Form<Fahrt> filledForm = fahrtForm.bindFromRequest();
        if (filledForm.hasErrors()) {
            return badRequest(views.html.suche.render("suche", fahrtForm, id, fahrtList));
        }
        List<Fahrt> fahrten = Fahrt.getFahrt(filledForm.get().startAdresse, filledForm.get().zielAdresse, filledForm.get().datum);
        List<Fahrt> aussortierteListe = new ArrayList<Fahrt>();
        for (Fahrt fahrt : fahrten) {
            if (fahrt.mitfahrer != null && Integer.parseInt(fahrt.getMitfahrerAktuell()) < Integer.parseInt(fahrt.mitfahrer)) {
                aussortierteListe.add(fahrt);
            }
        }
        return ok(views.html.suche.render("suche", filledForm, id, aussortierteListe));
    }

    public static int getNextId() {
        int id = 1;
        List<Fahrt> fahrten = Fahrt.getAllFahrten();
        for (Fahrt fahrt : fahrten) {
            if (fahrt.getId() >= id) {
                id = fahrt.getId() + 1;
            }
        }
        return id;
    }

    public static void buchen(int fahrtId) {
        Fahrt.update(Fahrt.getFahrtById(fahrtId));
    }
}
