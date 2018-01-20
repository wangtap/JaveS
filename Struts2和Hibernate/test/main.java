import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import staff.domain.Staff;
import user.domain.User;
import util.HibernateUtil;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;


public class main {

@Test
    public void test(){

        HibernateUtil.handle(session -> {
            User user = new User();
            user.setUsername("wt");
            user.setPassword("123");


            session.save(user);
            return null;
        });
}

    @Test
    public void staff(){
        HibernateUtil.handle(session -> {
            Staff staff = new Staff();
            staff.setAddress("武汉");
            staff.setAge(10);
            staff.setDepartment("市场部");
            staff.setHiredate(new Date(2018));
            staff.setPhone("13027136665");
            staff.setSname("王五");
            session.save(staff);
            return null;
        });
    }

    public void query(String name,String password){
        Session s=null;
        try{
            s=HibernateUtil.getSession();

            //from后面是对象，不是表名
            String hql="from User as user where user.username=:name and user.password=:password";//使用命名参数，推荐使用，易读。
            Query query=s.createQuery(hql);
            query.setString("name", name);
            query.setString("password",password);

            List<User> list=query.list();

            for(User user:list){
                System.out.println(user.getUid());
            }
        }finally{
            if(s!=null)
                s.close();
        }
    }
    @Test
    public void t11(){
        query("wt","123");
    }



}
