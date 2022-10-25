package tobi.tobiexercise03.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import tobi.tobiexercise03.domain.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    //private ConnectionMaker cm;
    private DataSource dataSource;
    //private final JdbcContext jdbcContext;
    private JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    RowMapper<User> rowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            return user;
        }
    };

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //conn = cm.makeConnection();
            conn = dataSource.getConnection();
            ps = stmt.makePreparedStatement(conn);
            ps.executeUpdate();
        } catch (SQLException e) {
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

    /*public User get(String id) throws ClassNotFoundException, SQLException {
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
    }*/
    public User findById(String id) {
        String sql = "select * from users where id = ?";
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    public List<User> getAll() {
        String sql = "select * from users order by id";
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    public void add(final User user) {
        this.jdbcTemplate.update("insert into users(id, name, password) values(?,?,?);",
                user.getId(), user.getName(), user.getPassword());
    }

    public void deleteAll() {
        this.jdbcTemplate.update("delete from users");
        //this.jdbcContext.executeSql("delete from users");
    }

    public int getCount() {
        return this.jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
    }

    /*    public List<User> findAll() throws ClassNotFoundException, SQLException {
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
    }*/
    /*public void add(final User user) throws SQLException {
        jdbcContextWithStatementStrategy(
                new StatementStrategy() {
                    @Override
                    public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps = connection.prepareStatement("insert into users(id, name, password) values(?,?,?)");
                        ps.setString(1, user.getId());
                        ps.setString(2, user.getName());
                        ps.setString(3, user.getPassword());
                        return ps;
                    }
                }
        );*/


    /*    public void deleteAll() throws SQLException, ClassNotFoundException {
     *//*Connection conn = null;
        PreparedStatement ps = null;
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());*//*
        StatementStrategy deleteAllStrategy = new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
                return connection.prepareStatement("delete from users");
            }
        };
        jdbcContextWithStatementStrategy(deleteAllStrategy);
    }*/


    // 코드가 변경되었기 때문에 강사님 블로그 참고.
/*    public int getCount() throws SQLException, ClassNotFoundException {
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
    }*/


}
