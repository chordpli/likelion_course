package tobi.tobiexercise03.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tobi.tobiexercise03.domain.User;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {


    @Autowired
    ApplicationContext context;
    UserDao userDao;
    // @before -> beforeEach
    @BeforeEach
    void setUp(){
        this.userDao = context.getBean("awsUserDao", UserDao.class);
    }

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        String id ="23";
        userDao.add(new User(id, "Nunu", "11223"));
        assertEquals(1, userDao.getCount());

        User user = userDao.get(id);
        assertEquals("Nunu", user.getName());

    }

    @Test
    void count() throws SQLException, ClassNotFoundException {
        User user1 = new User("1", "경환", "33");
        User user2 = new User("2", "소현", "22");
        User user3 = new User("3", "수진", "11");

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        assertEquals(1, userDao.getCount());
        userDao.add(user2);
        assertEquals(2, userDao.getCount());
        userDao.add(user3);
        assertEquals(3, userDao.getCount());


        User userGet1 = userDao.get(user1.getId());
        assertEquals(userGet1.getName(), user1.getName());
        assertEquals(userGet1.getPassword(), user1.getPassword());
        User userGet2 = userDao.get(user2.getId());
        assertEquals(userGet2.getName(), user2.getName());
        assertEquals(userGet2.getPassword(), user2.getPassword());
    }

    @Test
    void findById(){
        assertThrows(EmptyResultDataAccessException.class, () ->{
            userDao.get("30");
        });
    }

    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.deleteAll();


    }
}