package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {

    public static Connection connect() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/dem";
            String uname = "root";
            String pwd = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, uname, pwd);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Database driver not found", e);
        }
    }

    public void disconnect(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); //  handle the exception 
        }
    }
}
