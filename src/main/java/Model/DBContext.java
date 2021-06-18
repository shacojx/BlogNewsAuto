/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBContext {
    

    private final String serverName = "localhost";
//    private final String portNumber = "33452";
//    private final String userID = "phamphong";
//    private final String passwd = "phong@123";
    //=====================
    private final String portNumber = "3306";
    private final String userID = "root";
    private final String passwd = "7122461311";

    private final String dbName = "blogauto";
    //&useTimezone=true&serverTimezone=GMT%2B8
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        String url = "jdbc:mysql://" + serverName + ":"  + portNumber +"/" + dbName  + "?useUnicode=true&characterEncoding=UTF-8";
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url,userID,passwd);
    }
}
