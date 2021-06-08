/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import EntityNews.ListNewtmp;
import EntityNews.Visiter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
                    + "(`ip`,`location`,`date`,`id_news`, `type`) "
                    + "VALUES (?, ?,?,?,?)";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, acc.getIp());
            ps.setString(2, acc.getLocation());
            ps.setString(3, acc.getDate());
            ps.setString(4, acc.getId_news());
            ps.setString(5, acc.getType());
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
    
    public int countByType(String type) throws SQLException {
        try {
            String query = "SELECT COUNT(*) FROM `blogauto`.`visiter` where `type`=?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, type);
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
    
    public int countByMon(String thang) throws SQLException {
        try {
            String daynow = "%"+thang+"%";
            String query = "SELECT COUNT(*) FROM `blogauto`.`visiter` where `date` LIKE ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, daynow);
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
    
    public int countByDay(String day) throws SQLException {
        try {
            String daynow = "%"+day+"%";
            String query = "SELECT COUNT(*) FROM `blogauto`.`visiter` where `date` LIKE ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, daynow);
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
    
    public int countByTime(String day1, String day2) throws SQLException {
        try {
            String query = "SELECT COUNT(*) FROM  `blogauto`.`visiter` where "
                    + "STR_TO_DATE(REPLACE( REPLACE( DATE, '-', '' ), ':', '' ),'%Y%m%d %H%i%s') "
                    + "BETWEEN ? AND ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, day1);
            ps.setString(2, day2);
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
    
    public ArrayList<String> getPaggingDay(String day) throws SQLException {
        try {
            String daynow = "%"+day+"%";
            String query = "SELECT * FROM  `blogauto`.`visiter` where `date` LIKE ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, daynow);
            rs = ps.executeQuery();
            ArrayList<String> list_id_news = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString(4);
                list_id_news.add(id);
            }
            return list_id_news;
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }
    
    public ArrayList<Visiter> getAll() throws SQLException {
        try {
            String query = "SELECT * FROM  `blogauto`.`visiter`;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Visiter> list_new = new ArrayList<>();
            while (rs.next()) {
                Visiter ne = new Visiter(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list_new.add(ne);
            }
            return list_new;
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }
    
    public ArrayList<String> getAllNuoc() throws SQLException {
        try {
            String query = "SELECT `location` FROM `blogauto`.`visiter`;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<String> list_new = new ArrayList<>();
            while (rs.next()) {
                String nuoc = rs.getString(1);
                list_new.add(nuoc);
            }
            return list_new;
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }
    
    public int countByQuocGia(String nuoc) throws SQLException {
        try {
            String query = "SELECT COUNT(*) FROM `blogauto`.`visiter` where `location` = ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nuoc);
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
