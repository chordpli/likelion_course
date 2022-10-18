package com.tobiexercise01.dao;

import com.line.domain.User;

import java.sql.*;

public class UserDao {
    private SimpleConnectionMaker simpleConnectionMaker;

    public UserDao() {
        this.simpleConnectionMaker = new SimpleConnectionMaker();
    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        Connection conn = simpleConnectionMaker.makeNewConnection();
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

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = simpleConnectionMaker.makeNewConnection();
        String sql = "Insert into users(id, name, password) values(?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        //userDao.add(new User("6", "Ruru", "1234qwer"));
        System.out.println(userDao.get("6"));
    }

}
