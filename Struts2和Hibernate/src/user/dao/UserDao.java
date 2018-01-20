package user.dao;

import org.hibernate.Query;
import user.domain.User;
import util.HibernateUtil;

import java.util.List;

public class UserDao {
    public List queryUserListByUsernameAndPassword(String username, String password){
        List<User> userList = HibernateUtil.handle(session -> {
            Query query = session.createQuery("from User as user where user.username=:username and user.password=:password");
            query.setString("username", username);
            query.setString("password", password);
            List<User> list = query.list();
            return list;
        });
        return userList;
    }




}

