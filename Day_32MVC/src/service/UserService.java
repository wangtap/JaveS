package service;

import dao.UserDao;
import domain.User;
import service.exceptiom.InvalidUsernameException;
import service.exceptiom.LoginExection;
import service.exceptiom.PasswordNotMatchedExection;

public class UserService {
            UserDao userdao=    new UserDao();
    public User login(User user) throws LoginExection {
        User fromDb = userdao.queryByUsername(user.getUsername());
        if (fromDb==null){
            throw new InvalidUsernameException();
        }
        if (!fromDb.getPassword().equals(user.getPassword())){
            throw  new PasswordNotMatchedExection();
            //  m密码不匹配throw
        }
        return fromDb;
    }
}
