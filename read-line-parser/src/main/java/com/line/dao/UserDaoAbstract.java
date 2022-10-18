package com.line.dao;

import com.line.domain.User;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class UserDaoAbstract {
    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection c = getConnection();
    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        Connection c = getConnection();
        return new User();
    }

    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
}
