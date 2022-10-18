package com.line.dao;

import com.line.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class UserDaoAbstract {
    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        String sql = "Insert into users(id, name, password) values(?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        String sql = "select id, name, password from users where id= ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();

        rs.next();

        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        rs.close();
        ps.close();
        conn.close();
        return user;
    }
}
