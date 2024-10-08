package com.company.dao;

import java.sql.*;

public class ConnectionFactory {

    public static Connection getConnection() {
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "625906821");
        } catch (SQLException e) {
            System.out.println("SQLException " + e);
        }
        return c;
    }
}
