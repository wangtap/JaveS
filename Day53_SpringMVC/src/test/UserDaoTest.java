import com.lanou.study.user.dao.UserDao;
import com.lanou.study.user.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    private ApplicationContext context;
    private UserDao userDao;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("spring-servlet.xml");
        userDao = (UserDao) context.getBean("userDao");
    }
    @Test
    public void testFindUserById() {
        User user = userDao.findUserById(26);
        System.out.println(user);
    }

    @Test
    public void insert() throws Exception {
        userDao.insertUser(new User("username","password"));
    }

    @Test
    public void login() throws Exception {
        User login = userDao.login(new User("username", "password"));
        System.out.println(login);
    }
}