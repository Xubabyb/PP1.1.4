package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static String urlCon = "jdbc:mysql://localhost:3306";
    static String userCon = "root";
    static String passCon = "12345";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(urlCon, userCon, passCon);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
