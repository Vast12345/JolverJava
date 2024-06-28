package com.databases;

import java.sql.Statement;
import java.text.MessageFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Create tables for respective queries.

        String url = "jdbc:mysql://localhost:3306/products";
        String user = "root";
        String password = "123456";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create table
            Statement statement = connection.createStatement();
            String createTableSQL = "create table if not exists inventario (" + "id int primary key auto_increment, " + "name varchar(50))";
            statement.execute(createTableSQL);

            // Create a query
            String query = "Insert into castegory (name) values " +
            "('Pinturas'), " +
            "('Herramientas')";
            statement.executeUpdate(query);

            // Go through the result set
            String anotherQuery = "select id, name from category";
            ResultSet rs = statement.executeQuery(anotherQuery);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(MessageFormat.format("Id juego {0} - Nombre {1}", id, name));
            }

            // Operation UPDATE
            String updateSQL = "UPDATE category set name = 'Grifos' where id = 1";
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println("Numero de filas actualizadas: " + rowsUpdated);

            // Operation DELETE
            String deleteSQL = "DELETE from category where id = 1";
            int rowsDeleted = statement.executeUpdate(deleteSQL);
            System.out.println("Numero de filas eliminado: "+ rowsDeleted);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}