/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.XuLy;

import Entity.Account;
import Model.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class CheckAccExit {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    

    public Account checkUserExit(String user) throws SQLException {
        try {
            String query = "select * FROM `blogauto`.`user` where UserName = ?;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);

            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString(3), rs.getString(4), rs.getString(9));
                return a;
            }

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            rs.close();
            ps.close();
            conn.close();
        }
        return null;
    }

}
