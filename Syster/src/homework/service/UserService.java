package homework.service;

import homework.dao.UserDao;
import homework.domain.User;
import homework.service.exeception.InvalidUsernameException;
import homework.service.exeception.LoginExection;
import homework.service.exeception.PasswordNotMatchedExection;

import java.sql.SQLException;

public class UserService {
    UserDao userdao=    new UserDao();
    public User login(User user) throws LoginExection, SQLException {
        User fromDb = userdao.queryByUsername(user.getUsername());
        if (fromDb==null){
            throw new InvalidUsernameException();
        }
        if (!fromDb.getPassword().equals(user.getPassword())){
            throw  new PasswordNotMatchedExection();
        }
        return fromDb;
    }
}
