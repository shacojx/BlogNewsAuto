/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityNews;

/**
 *
 * @author ShacoJX
 */
public class ListNewtmp {
    private String id;
    private String title;
    private String type;
    private String date;
    private String view;

    public ListNewtmp() {
    }

    public ListNewtmp(String id, String title, String type, String date, String view) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.date = date;
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "ListNewtmp{" + "id=" + id + ", title=" + title + ", type=" + type + ", date=" + date + ", view=" + view + '}';
    }
    
    
    
    
}
