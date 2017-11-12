package br.com.app.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fatec";
            String user = "root";
            String password = "asdf1234";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException error) {
            throw new RuntimeException(error);
        }
    }
    
}