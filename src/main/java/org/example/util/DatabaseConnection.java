package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
    private static String url = "jdbc:mysql://localhost:3306/basicos_jdbc";
    private static String user = "root";
    private static String password = "9PM8tv$h#$*e";

    private static Connection instance;

    public static Connection getInstance() throws SQLException {
        if(instance == null) instance = DriverManager.getConnection(url, user, password);
        System.out.println("CONEXION EXITOSA");
        return instance;
    }
}
