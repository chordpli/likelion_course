package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();
        User user = new User("9", "HiHwan", "1123");
        //userDao.add(user);

        User selectedUser = userDao.get("9");
        Assertions.assertEquals("HiHwan", selectedUser.getName());

    }

}