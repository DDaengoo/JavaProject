package com.mycom.word;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.connection;
public class DBCConnection {
    private static Connection conn = null;

    public static Connection getConnection() {
        if(conn== null){
            try{
                class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite");
            } catch (ClassNotFoundException e){
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
