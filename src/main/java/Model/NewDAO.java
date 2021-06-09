/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import EntityNews.New;
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
public class NewDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void insertNews(New ne) throws SQLException {
        try {
            String query = "INSERT INTO `blogauto`.`news` "
                    + "(`id`, `title`, `shortdes`, `context`, `date`,"
                    + "`type`,`cover`) "
                    + "VALUES (?,?,?,?,?,?,?)";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ne.getId());
            ps.setString(2, ne.getTitle());
            ps.setString(3, ne.getShortDes());
            ps.setString(4, ne.getContent());
            ps.setString(5, ne.getDate());
            ps.setString(6, ne.getType_new());
            ps.setString(7, ne.getCover());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
    }

    public New getNewById(String id) throws SQLException {
        try {
            String query = "SELECT * FROM `blogauto`.`news` WHERE `id` = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7));
                return ne;
            }
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }
    
    public ArrayList<New> getAll() throws SQLException {
        try {
            String query = "SELECT * FROM  `blogauto`.`news`;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<New> list_new = new ArrayList<>();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
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

    public ArrayList<New> getPaggingAll(int pageIndex) throws SQLException {
        int index = (pageIndex - 1) * 12;
        try {
            String query = "SELECT * FROM  `blogauto`.`news` ORDER BY  date desc  LIMIT 12 OFFSET ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, index);
            rs = ps.executeQuery();
            ArrayList<New> list_new = new ArrayList<>();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
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
    

    public ArrayList<New> getPaggingByType(int pageIndex, String type) throws SQLException {
        int index = (pageIndex - 1) * 4;
        try {
            String query = "SELECT * FROM `blogauto`.`news` WHERE `type` = ? ORDER BY date DESC LIMIT 4 OFFSET ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, type);
            ps.setInt(2, index);
            rs = ps.executeQuery();
            ArrayList<New> list_new = new ArrayList<>();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
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
    
    

    public ArrayList<New> getTop6News() throws SQLException {

        try {
            String query = "SELECT * FROM `blogauto`.`news` ORDER BY date desc LIMIT 8;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<New> list_new = new ArrayList<>();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
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
    
    public ArrayList<New> getTop4News() throws SQLException {

        try {
            String query = "SELECT * FROM `blogauto`.`news` ORDER BY date desc LIMIT 4;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<New> list_new = new ArrayList<>();
            while (rs.next()) {
                New ne = new New(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
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

    public void DeleteNewByID(String id) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `blogauto`.`news` WHERE `id`=?;";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, id);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public void Update(New a) throws SQLException {
        try {
            String query = "UPDATE `blogauto`.`news` SET `title` = ?, `context` = ?, `type` =?, `cover`=? WHERE `id`=?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, a.getTitle());
            ps.setString(2, a.getContent());
            ps.setString(3, a.getType_new());
            ps.setString(4, a.getCover());
            ps.setString(5, a.getId());
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
    
    public int count() throws SQLException {
        try {
            String query = "SELECT COUNT(*) FROM `blogauto`.`news`";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
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
            String query = "SELECT COUNT(*) FROM `blogauto`.`news` where `type`=?;";
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
    
    public String getCoverById(String id) throws SQLException {
        try {
            String query = "SELECT `cover` FROM `blogauto`.`news` WHERE `id` = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String cover = rs.getString(1);
                return cover;
            }
        } catch (Exception ex) {
            Logger.getLogger(NewDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }
    
    
    

}
