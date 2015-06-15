/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import play.*;
import play.libs.F.Callback;
import play.libs.F.Callback0;
import play.mvc.*;
import java.util.Observable;
import java.util.Observer;

import views.html.*;

public class Socket extends Controller implements Observer {

    private static ArrayList<WebSocket.Out> socketList = new ArrayList<>();

    public static WebSocket<String> getData() {
        WebSocket<String> ws = null;
        ws = new WebSocket<String>() {

            public void onReady(WebSocket.In<String> in, final WebSocket.Out<String> out) {
                socketList.add(out);
                in.onMessage(new Callback<String>() {

                    public void invoke(String g) {
                        int fahrtId = Integer.parseInt(g);
                        Application.buchen(fahrtId);
                        out.write(g);
                    }
                });
                in.onClose(new Callback0() {

                    public void invoke() {
                        System.out.println("");
                    }
                });
            }
        };
        return ws;
    }

    public static void notifySockets(String message) {
        for (WebSocket.Out socket : socketList) {
            socket.write(message);
        }
    }

    public void register() {
        System.out.println("---------registriert---------------");
        models.Fahrt.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("---------update---------- " + arg1);
        for (WebSocket.Out out : socketList) {
            out.write("reload");
        }

    }

}
