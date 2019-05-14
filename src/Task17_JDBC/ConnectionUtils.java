package Task17_JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static Task17_JDBC.ShowMetaDataDB.*;

public class  ConnectionUtils{

    private static ResourceBundle rb = null;
    private static volatile boolean isDriverLoaded = false;
    static ThreadLocal<Connection> connection = new ThreadLocal<>();
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("database");
        if (rb == null) {
            URL = "UNDEFINED";
            USER = "UNDEFINED";
            PASSWORD = "UNDEFINED";
            System.out.println("Бандл для db не был инициализирован");
        } else {
            URL = rb.getString("url");
            USER = rb.getString("user");
            PASSWORD = rb.getString("password");
            try {
                Class.forName(rb.getString("driver"));
                isDriverLoaded = true;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws DataBasaException {
        if (!isDriverLoaded) {
            throw new DataBasaException("Драйвер не был загружен");
        }

        try {
            if (connection.get() == null) {
                connection.set(DriverManager.getConnection(URL, USER, PASSWORD));
            }
            return connection.get();
        } catch (SQLException e) {
            throw new DataBasaException("Ошибка получения соединения " +  e.getMessage());
        }
    }
}
