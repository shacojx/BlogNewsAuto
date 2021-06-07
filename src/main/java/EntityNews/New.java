/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityNews;

/**
 *
 * @author Admin
 */
public class New {

    private String id;
    private String title;
    private String shortDes;
    private String content;
    private String date;
    private String type_new;
    private String cover;

    public New() {
    }

    public New(String id, String title, String shortDes, String content, String date, String type_new, String cover) {
        this.id = id;
        this.title = title;
        this.shortDes = shortDes;
        this.content = content;
        this.date = date;
        this.type_new = type_new;
        this.cover = cover;
    }

    public New(String id, String title, String content, String type_new, String cover) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type_new = type_new;
        this.cover = cover;
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

    public String getShortDes() {
        return shortDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType_new() {
        return type_new;
    }

    public void setType_new(String type_new) {
        this.type_new = type_new;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "New{" + "id=" + id + ", title=" + title + ", shortDes=" + shortDes + ", content=" + content + ", date=" + date + ", type_new=" + type_new + ", cover=" + cover + '}';
    }

}
