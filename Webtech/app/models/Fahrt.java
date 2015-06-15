/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.avaje.ebean.Ebean;
import interfaces.Observerable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Observer;
import java.util.Observable;
import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.*;
import play.db.ebean.Model.*;

@Entity
public class Fahrt extends Model implements Observerable {

    private static Fahrt instance;

    @Id
    public String id;

    public String mitfahrer;
    public String mitfahrerAktuell;

    @Required
    public String startAdresse;

    @Required
    public String zielAdresse;

    public String zweitAdresse;

    @Required
    public String datum;

    public static Finder<String, Fahrt> find = new Finder<String, Fahrt>(String.class, Fahrt.class);

    public String getMitfahrerAktuell() {
        return mitfahrerAktuell;
    }

    public String getMitfahrer() {
        return mitfahrer;
    }

    public String getStartAdresse() {
        return startAdresse;
    }

    public String getZielAdresse() {
        return zielAdresse;
    }

    public String getZweitAdresse() {
        return zweitAdresse;
    }

    public String getDatum() {
        return datum;
    }

    public String freiePlaetze(Fahrt fahrt) {
        int h = Integer.parseInt(fahrt.getMitfahrer()) - Integer.parseInt(fahrt.getMitfahrerAktuell());
        return "" + h;
    }

    public static List<Fahrt> getFahrt(String startAdresse, String zielAdresse, String datum) {
        return Ebean.find(Fahrt.class).where().like("startAdresse", startAdresse).like("zielAdresse", zielAdresse).like("datum", datum).findList();
    }

    public static void create(Fahrt fahrt, String Id) {
        fahrt.id = Id;
        fahrt.mitfahrerAktuell = "0";
        fahrt.save();
    }

    public static Fahrt getFahrtById(int id) {
        return find.byId("" + id);
    }

    public static List<Fahrt> getAllFahrten() {
        return Ebean.find(Fahrt.class).findList();
    }

    public static boolean getFahrtbyArgs(String startAdresse, String zielAdresse, String datum) {
        if (Ebean.find(Fahrt.class).where().like("startAdresse", startAdresse).like("zielAdresse", zielAdresse).like("datum", datum).findList().size() == 1) {
            return true;
        }
        return false;
    }

    public int getId() {
        return Integer.parseInt(id);
    }

    public static void createFahrtByArgs(String Id, String startAdresse, String zielAdresse, String zweitAdresse, String datum, String anzahlPersonen) {
        Fahrt f = new Fahrt();
        f.id = Id;
        f.mitfahrer = anzahlPersonen;
        f.mitfahrerAktuell = "0";
        f.startAdresse = startAdresse;
        f.zielAdresse = zielAdresse;
        f.zweitAdresse = zweitAdresse;
        f.datum = datum;
        Ebean.save(f);
    }

    public static void update(Fahrt fahrt) {
        Fahrt f = new Fahrt();
        f.id = fahrt.id;
        f.mitfahrer = fahrt.mitfahrer;
        f.startAdresse = fahrt.startAdresse;
        f.zielAdresse = fahrt.zielAdresse;
        f.zweitAdresse = fahrt.zweitAdresse;
        f.datum = fahrt.datum;
        f.mitfahrerAktuell = "" + (Integer.parseInt(fahrt.mitfahrerAktuell) + 1);
        System.out.println("geupdatet" + f.mitfahrerAktuell);
        Ebean.update(f);
    }

    public static Fahrt getInstance() {
        if (instance == null) {

            instance = new Fahrt();
        }

        return instance;
    }

    HashSet<Observer> observers = new HashSet<Observer>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        Collection<Observer> observers1 = getObservers();
        if (observers1 == null) {
            System.out.println("Observer is empty!");
        } else {
            System.out.println("Observer is not empty!");
        }
        for (Observer o : observers1) {
            o.update(new Observable() {}, "reload");
        }
    }

    public Collection<Observer> getObservers() {
        return observers;
    }

}
