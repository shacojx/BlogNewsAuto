/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.XuLy;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author ShacoJX
 */
public class GeoIP {

    public String getLocation(String ip_src) {

        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://ipinfo.io/" + ip_src + "/json?token=b27d748b3bf03e")
                    .method("GET", null)
                    .build();
            Response response = client.newCall(request).execute();
            String[] s = response.body().string().split("\n");

            double lat_src = 0;
            double long_src = 0;
            String location_src = null;
            String city = null;

            for (String x : s) {
                if (x.contains("\"country\"")) {
                    location_src = x.split(":")[1].trim();
                    location_src = location_src.replaceAll("\"", "");
                    location_src = location_src.replaceAll(",", "");
                }
                if(x.contains("\"city\"")){
                    city = x.split(":")[1].trim();
                    city = city.replaceAll("\"", "");
                    city = city.replaceAll(",", "");
                }
            }
            
            String diachi = city +" - "+ location_src;

            return diachi;

        } catch (IOException ex) {
            Logger.getLogger(GeoIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
