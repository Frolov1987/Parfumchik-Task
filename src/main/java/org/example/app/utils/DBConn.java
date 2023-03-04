package org.example.app.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    private static Connection conn = null;
    public static Connection connect() {
        try {
            conn = DriverManager.getConnection(Constants.DB_DRIVER +
                    Constants.DB_BASE_URL + Constants.DB_NAME);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
