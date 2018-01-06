package dao;

import domain.User;

public class UserDao {
    public User queryByUsername(String formU){
     if(formU.equals("123")){
         User user =new User();
         user.setUsername("123");
         user.setPassword("666");
         return user;
        }else {
         return null;
                }
    }
}
