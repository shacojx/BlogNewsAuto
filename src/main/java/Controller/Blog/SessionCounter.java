/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Blog;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author ShacoJX
 */
public class SessionCounter implements HttpSessionListener {

    private List sessions = new ArrayList();

    public SessionCounter() {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        sessions.add(session.getId());

        session.setAttribute("counter", this);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        sessions.remove(session.getId());

        session.setAttribute("counter", this);
    }

    public int getActiveSessionNumber() {
        return sessions.size();
    }

}
