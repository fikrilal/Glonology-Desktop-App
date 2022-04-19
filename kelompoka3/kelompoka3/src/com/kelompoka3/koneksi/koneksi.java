package com.kelompoka3.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//package com.kelompoka3.koneksi;

public class koneksi {
    public static Connection mysqlconfig;
    public static Statement stm;
    public static Connection koneksi()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/kelompoka3";
            String user = "root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            stm = mysqlconfig.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (SQLException e) {
            System.err.println("Koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
        }
    
    public static void main(String args[]) throws SQLException{
koneksi();
}
}

