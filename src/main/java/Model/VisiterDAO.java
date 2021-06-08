/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import EntityNews.Visiter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShacoJX
 */
public class VisiterDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void insert(Visiter acc) throws SQLException {
        try {
            String query = "INSERT INTO `blogauto`.`visiter` "
                    + "(`ip`,`location`,`date`,`id_news`) "
                    + "VALUES (?, ?,?,?)";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, acc.getIp());
            ps.setString(2, acc.getLocation());
            ps.setString(3, acc.getDate());
            ps.setString(4, acc.getId_news());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
        } catch (Exception ex) {
            Logger.getLogger(AccDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        } 
    }
    
    public int countByNews(String id_news) throws SQLException {
        try {
            String query = "SELECT COUNT(*) FROM `blogauto`.`visiter` where `id_news`=?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id_news);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return 0;
    }
    
    
}
