package chapter01.tobiexercise03.dao;

import chapter01.tobiexercise03.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String id ="21";
        userDao.add(new User(id, "Nunu", "11223"));


        User user = userDao.get(id);

    }

}