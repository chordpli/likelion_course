package chapter01.tobiinterface.dao;

import chapter01.tobiinterface.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    ConnectionMaker cm = new AWSConnectionMaker();


    public List<User> findAll() throws ClassNotFoundException, SQLException {
        Connection conn = cm.makeConnection();
        String sql = "select id, name, password from users";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<User> userList = new ArrayList<>();
        while(rs.next()){
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            userList.add(user);
        }

        rs.close();
        ps.close();
        conn.close();
        return userList;
    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        Connection conn = cm.makeConnection();
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

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = userDao.get("1");
        System.out.println(user);

        List<User>userList = new ArrayList<>();
        userList = userDao.findAll();

        for (User u : userList) {
            System.out.println(u);
        }
    }
}
