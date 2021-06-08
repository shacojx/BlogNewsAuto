/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package News;

import EntityNews.ListNewtmp;
import EntityNews.New;
import Model.NewDAO;
import Model.VisiterDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShacoJX
 */
public class GetTopNews {

    public ArrayList<ListNewtmp> RankingIP() {
        try {
            NewDAO nedao = new NewDAO();
            VisiterDAO vidao = new VisiterDAO();
            ArrayList<New> list_news = nedao.getAll();
            ArrayList<ListNewtmp> list_tmp = new ArrayList<>();
            for (New xlxx : list_news) {
                ListNewtmp lily = new ListNewtmp(xlxx.getId(), xlxx.getTitle(), xlxx.getType_new(), xlxx.getDate(), vidao.countByNews(xlxx.getId()) + "");
                list_tmp.add(lily);
            }
            Collections.sort(list_tmp, new Comparator<ListNewtmp>() {
                @Override
                public int compare(ListNewtmp t, ListNewtmp t1) {
                    return Integer.parseInt(t1.getView()) - Integer.parseInt(t.getView());
                }
            });

            ArrayList<ListNewtmp> list_top6 = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                ListNewtmp lolo = new ListNewtmp(list_tmp.get(i).getId(), list_tmp.get(i).getTitle(), list_tmp.get(i).getType(),
                        list_tmp.get(i).getDate(), list_tmp.get(i).getView());
                list_top6.add(lolo);
            }

            return list_top6;

        } catch (SQLException ex) {
            Logger.getLogger(GetTopNews.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
