package tobi.tobiexercise03.domain;

import org.junit.jupiter.api.Test;
import tobi.tobiexercise03.dao.UserDao;
import tobi.tobiexercise03.dao.UserDaoFactory;

import java.sql.SQLException;

class UserTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String id ="21";
        userDao.add(new User(id, "Nunu", "11223"));

        User user = userDao.get(id);
    }

}