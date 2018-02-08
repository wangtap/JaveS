package study.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import study.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    private User user;

    @Override
    public void add() {
        this.getHibernateTemplate().save(user);
//        getHibernateTemplate().getSessionFactory()
        System.out.println("----add----"+user.getUsername());
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
