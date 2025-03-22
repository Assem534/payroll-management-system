package com.example.parrollmangmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://shuttle.proxy.rlwy.net:10948/railway";
    private static final String USER = "postgres";
    private static final String PASSWORD = "KLDqUUSHeHpGlmKAyYrRThEqsuyyraRs";

    public static Connection connect() {
        Connection conn =null;
        try {
            conn  = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to PostgreSQL successfully!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }

}
