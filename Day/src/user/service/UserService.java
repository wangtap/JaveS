package user.service;

import user.dao.UserDao;
import user.domain.User;

public class UserService {
    UserDao userDao=new UserDao();
    public int register(User user){
        int i = userDao.insert(user);
        return i;
    }
    public int login(String username,String password ){
        User user = userDao.queryUserByUsername(username);
        User user1 = userDao.queryUserByPassword(password);

        if (user!=null){
            if (user1!=null){
                if (user.toString().equals(user1.toString())){
                    return 3;
                }return 2;
            }return 1;
        }return 0;
    }


}
