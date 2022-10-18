package com.line.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDaoAbstract {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
