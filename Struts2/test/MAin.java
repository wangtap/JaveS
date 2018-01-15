import user.dao.UserDao;
import user.domain.User;

public class MAin {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User("3", "3", "3");
        userDao.insert(user);
    }
}
