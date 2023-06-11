/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_tugas_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author DYNABOOK - Chintia Liu Wintin 2109106008
 */
public class Config {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbsepatusport";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Failed to connect to database.");
            e.printStackTrace();
        }
        return conn;
    }
}
