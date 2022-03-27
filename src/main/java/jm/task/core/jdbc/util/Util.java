package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/testUser";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "12345";

    private static Connection connection = null;
    private static SessionFactory sessionFactory = null;


    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .setProperty("hibernate.connection.url", URL)
                    .setProperty("hibernate.connection.username", LOGIN)
                    .setProperty("hibernate.connection.password", PASSWORD)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
