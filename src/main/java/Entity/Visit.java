/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ShacoJX
 */
public class Visit {
    private String loc;
    private int view;

    public Visit() {
    }

    public Visit(String loc, int view) {
        this.loc = loc;
        this.view = view;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Visit{" + "loc=" + loc + ", view=" + view + '}';
    }

    
    
}
