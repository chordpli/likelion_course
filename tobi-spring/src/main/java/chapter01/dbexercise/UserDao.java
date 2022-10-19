package chapter01.dbexercise;

import chapter01.dbexercise.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDao {

    public User get(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHOST = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassowrd = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHOST, dbUser, dbPassowrd);
        String sql = "select id, name, password from users where id=?";
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

    public List<User> findAll() throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHOST = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassowrd = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHOST, dbUser, dbPassowrd);
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
