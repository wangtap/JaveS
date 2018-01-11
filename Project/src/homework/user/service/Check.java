package homework.user.service;

import homework.user.dao.UserDao;
import homework.user.domain.User;
import homework.user.service.exeception.LoginException.InvalidEmailException;
import homework.user.service.exeception.LoginException.PasswordException;
import homework.user.service.exeception.LoginException.StateException;
import homework.user.service.exeception.RegisterExcepion.RegisterFormatException.EmailFormatException;
import homework.user.service.exeception.RegisterExcepion.RegisterFormatException.PasswordFormatException;
import homework.user.service.exeception.RegisterExcepion.RegisterFormatException.RegisterFormatException;
import homework.user.service.exeception.RegisterExcepion.UserException.*;
import org.omg.CORBA.UserException;


import java.sql.SQLException;
import java.util.regex.Pattern;

public class Check {
    UserDao userDao=new UserDao();
    private final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,14}$";
    private final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
    private boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }
    public void checkFormat(User user) throws RegisterFormatException {
        if ( !isEmail(user.getEmail())){
            throw  new EmailFormatException();
        }
        if (!isPassword(user.getPassword())){
            throw  new PasswordFormatException();
        }
    }
    public void checkDuplicate(User user) throws SQLException, UserException {
        User user1 = userDao.queryUserByEmail(user.getEmail());
        User user2 = userDao.queryUserByUsername(user.getUsername());
        if (user1==null){
            if (user2==null){
                userDao.add(user);
            }else {
                throw new UsernameException();
            }
        }else {
            throw new EmailException();
        }
    }
    public  User  checkLoginByEmailAndPassword(String email,String password) throws SQLException, StateException, EmailException, PasswordException, InvalidEmailException {
        User user = userDao.queryUserByEmail(email);
        User user1 = userDao.queryUserByPassword(password);
        if (user != null) {
            if (user1 != null) {
                if (user.getCode().equals(user1.getCode())) {
                    if (userDao.queryStateByCode(user.getCode()).getState()==1) {
                        return user;
                        } else {
                            throw new StateException();
                       }
                    }
                } else {
                throw new PasswordException();
            }
        } else {
            throw new InvalidEmailException();
    }
        return null;
    }
}
