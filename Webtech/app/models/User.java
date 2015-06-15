/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.avaje.ebean.Ebean;
import java.util.List;
import play.db.ebean.Model.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

/**
 *
 * @author erman,philipp,simon
 */
@Entity
public class User extends Model {

    @Id
    @Required
    public String username;

    public String vorname;
    public String nachname;
    public String ort;

    @Email
    public String email;

    @Required
    public String passwort;

    public static Finder<String, User> find = new Finder<String, User>(String.class, User.class);

    public String getUsername() {
        return username;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getOrt() {
        return ort;
    }

    public String getMail() {
        return email;
    }

    public String getPasswort() {
        return passwort;
    }

    public static User getUser(String benutzername) {
        return find.byId(benutzername);
    }

    public static void create(User user) throws PersistenceException {
        user.save();
    }

    public static List<User> getAllUser() {
        return Ebean.find(User.class).findList();
    }

    public static void createUserByArgs(String username, String vorname, String nachname, String ort, String mail, String passwort) {
        User u = new User();
        u.email = mail;
        u.nachname = nachname;
        u.ort = ort;
        u.passwort = passwort;
        u.username = username;
        u.vorname = vorname;

        Ebean.save(u);
    }

    public static boolean login(String username, String passwort) {
        if (Ebean.find(User.class).where().like("username", username).like("passwort", passwort).findList().size() == 1) {
            return true;
        }
        return false;
    }

}
