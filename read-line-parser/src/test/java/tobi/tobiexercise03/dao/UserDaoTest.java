package tobi.tobiexercise03.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tobi.tobiexercise03.domain.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {


    @Autowired
    ApplicationContext context;
    UserDao userDao;
    User user1;
    User user2;
    User user3;

    //@before -> beforeEach
    @BeforeEach
    void setUp() {
        this.userDao = context.getBean("awsUserDao", UserDao.class);
        user1 = new User("1", "경환", "33");
        user2 = new User("2", "소현", "22");
        user3 = new User("3", "수진", "11");
        userDao.deleteAll();
    }

/*    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        this.userDao = context.getBean("awsUserDao", UserDao.class);
        //UserDao userDao2 = context.getBean("localUserDao", UserDao.class);

        System.out.println(userDao);
        //System.out.println(userDao2);

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        String id = "24";
        userDao.add(new User(id, "Nunu", "11223"));
        assertEquals(1, userDao.getCount());

        User user = userDao.findById(id);
        assertEquals("Nunu", user.getName());

    }

    @Test
    void count() throws SQLException, ClassNotFoundException {
        this.userDao = context.getBean("awsUserDao", UserDao.class);

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        assertEquals(1, userDao.getCount());
        userDao.add(user2);
        assertEquals(2, userDao.getCount());
        userDao.add(user3);
        assertEquals(3, userDao.getCount());


        User userGet1 = userDao.findById(user1.getId());
        assertEquals(userGet1.getName(), user1.getName());
        assertEquals(userGet1.getPassword(), user1.getPassword());
        User userGet2 = userDao.findById(user2.getId());
        assertEquals(userGet2.getName(), user2.getName());
        assertEquals(userGet2.getPassword(), user2.getPassword());
    }

    @Test
    void findById() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            userDao.findById("30");
        });
    }

    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.deleteAll();
    }*/

    @Test
    void getAllTest() {
        userDao.deleteAll();
        List<User> users = userDao.getAll();
        assertEquals(0, users.size());

        userDao.add(user1);
        userDao.add(user2);
        userDao.add(user3);
        users = userDao.getAll();
        assertEquals(3, users.size());

        //throws NullPointerException;
    }
}