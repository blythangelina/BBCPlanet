package com.example.bbcplanet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlHelper {

    public static Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "user");
        connectionProps.put("password", "Hackathon");

        return conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/", connectionProps);
        }
    }

