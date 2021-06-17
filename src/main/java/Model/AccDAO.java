/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AccDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int Update(Account a) throws SQLException {
        int rowCount = 0;
        try {
            String query = "UPDATE `blogauto`.`user` SET `password` = ? WHERE `username`=?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, a.getPassword());
            ps.setString(2, a.getUsername());

            rowCount = ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            return rowCount;
        } catch (Exception ex) {
            Logger.getLogger(AccDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return rowCount;
    }

    public int insertAcc(Account acc) throws SQLException {

        int rowCount = 0;
        try {

            String query = "INSERT INTO `blogauto`.`user` "
                    + "(`username`,`password`,`fullname`) "
                    + "VALUES (?, ?,?)";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getPassword());
            ps.setString(3, acc.getFullname());
           
            rowCount = ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            return rowCount;
        } catch (Exception ex) {
            Logger.getLogger(AccDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return rowCount;
    }

    public Account getAccByID(int id) throws SQLException {

        try {

            String query = "SELECT * FROM `blogauto`.`user` WHERE id=?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getString(1), rs.getString(2), rs.getString(3));
                return acc;
            }

        } catch (Exception ex) {
            Logger.getLogger(AccDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }
    
    public ArrayList<Account> getAccAll() throws SQLException {

        try {
            ArrayList<Account> listacc = new ArrayList<>();

            String query = "SELECT * FROM `blogauto`.`user`;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getString(1), rs.getString(2), rs.getString(3));
                listacc.add(acc);
            }
            return listacc;

        } catch (Exception ex) {
            Logger.getLogger(AccDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }
    
     public void DeleteAccByID(String username) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `blogauto`.`user` WHERE `username`=?;";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, username);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
     
     public void ResetAccByID(String username, String pass) throws SQLException, ClassNotFoundException {
        String query = "UPDATE `blogauto`.`user` SET `password` = ? WHERE `username`=?;";
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setString(1, pass);
        ps.setString(2, username);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

}
