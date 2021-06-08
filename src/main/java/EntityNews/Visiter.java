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
public class Visiter {
    private String ip;
    private String location;
    private String date;
    private String id_news;
    private String type;

    public Visiter() {
    }

    public Visiter(String ip, String location, String date, String id_news, String type) {
        this.ip = ip;
        this.location = location;
        this.date = date;
        this.id_news = id_news;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId_news() {
        return id_news;
    }

    public void setId_news(String id_news) {
        this.id_news = id_news;
    }

    @Override
    public String toString() {
        return "Visiter{" + "ip=" + ip + ", location=" + location + ", date=" + date + ", id_news=" + id_news + ", type=" + type + '}';
    }

   
    
    
}
