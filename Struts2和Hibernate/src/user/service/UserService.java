package user.service;

import org.omg.CORBA.UserException;
import user.dao.UserDao;
import user.domain.User;
import user.service.exceptiom.loginexception.LoginException;
import user.service.exceptiom.loginexception.UsernameException;

import java.util.List;

public class UserService {
    UserDao userDao=new UserDao();
    public User login(User formU) throws LoginException {
        List<User> list = userDao.queryUserListByUsernameAndPassword(formU.getUsername(), formU.getPassword());
        User user = new User();
        if (list==null){
            throw new LoginException();
        }else if (list.size()==1){
            user=list.get(0);
        }else {
            throw new UsernameException();
        }

        return user;
    }
}
