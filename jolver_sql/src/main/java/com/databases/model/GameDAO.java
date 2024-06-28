package com.databases.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;



public class GameDAO {
    private Connection connection;

    public GameDAO() throws IOException{
        try {
            Properties props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void addGame(Game game) throws SQLException {
        String query = "Insert into games (name) values (?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, game.getName());
        ps.executeUpdate();
    }

    public List<Game> getAllGames() throws SQLException {
        List<Game> games = new ArrayList<>();
        String query = "select * from games";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Game game = new Game(rs.getInt("id"), rs.getString("name"));
            games.add(game);
        }
        return games;
    }

    public void updateGame(Game game) throws SQLException {
        String query = "update games set name = ? where id = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, game.getName());
        ps.setInt(2, game.getId());
        ps.executeQuery();
    }

    public void deleteGame(int id) throws SQLException {
        String query = "DELETE from games where id = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, 10);
        ps.executeUpdate();
    }
}
