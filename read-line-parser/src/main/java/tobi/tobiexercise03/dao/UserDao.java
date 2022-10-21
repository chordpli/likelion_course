package tobi.tobiexercise03.dao;

import org.junit.jupiter.api.Test;
import org.springframework.dao.EmptyResultDataAccessException;
import tobi.tobiexercise03.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private ConnectionMaker cm;

    public UserDao() {
        this.cm = new AWSConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker) {
        this.cm = connectionMaker;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = cm.makeConnection();
            ps = stmt.makePreparedStatement(conn);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection conn = cm.makeConnection();
        try {
            // query문 작성
            String sql = "select id, name, password from users where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            //query문 실행
            User user = null;
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            }
            rs.close();
            ps.close();
            conn.close();

            // 없으면 exception
            if (user == null) {
                throw new EmptyResultDataAccessException(1);
            }

            return user;
        } catch (SQLException e) {
            throw new SQLException();
        }
    }

    public List<User> findAll() throws ClassNotFoundException, SQLException {
        Connection conn = cm.makeConnection();
        String sql = "select id, name, password from users";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            userList.add(user);
        }

        rs.close();
        ps.close();
        conn.close();
        return userList;
    }

    public void add(User user) throws SQLException, ClassNotFoundException {
        StatementStrategy st = new AddStatement(user);
        jdbcContextWithStatementStrategy(st);
        /*Connection conn = cm.makeConnection();
        String sql = "Insert into users(id, name, password) values(?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();*/
    }

    public void deleteAll() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());
    }

    public int getCount() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = cm.makeConnection();
            String sql = " select count(*) from users";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }

            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = userDao.get("1");
        System.out.println(user);

        List<User> userList = new ArrayList<>();
        userList = userDao.findAll();

        for (User u : userList) {
            System.out.println(u);
        }
    }

}
