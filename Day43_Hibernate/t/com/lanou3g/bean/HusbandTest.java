package com.lanou3g.bean;

import com.lanou3g.bean.onetoone.Husband;
import com.lanou3g.bean.onetoone.Wife;
import com.lanou3g.util.HibernateUtil;
import org.junit.Test;

public class HusbandTest {

    @Test
    public void save(){
        HibernateUtil.handle(session -> {
            Husband husband = new Husband();
            husband.setHname("赵明诚");

            Wife wife = new Wife();
            wife.setWname("李清照");

            husband.setWife(wife);
            wife.setHusband(husband);

            session.save(husband);
            return null;
        });
    }

    @Test
    public void get(){
        HibernateUtil.handle(session -> {
            Husband husband = session.get(Husband.class, 1);
            Wife wife = session.get(Wife.class, 1);
            System.out.println(husband+"====");
            System.out.println(husband.getWife());
            System.out.println(wife+"===");
            System.out.println(wife.getHusband());

            return null;
        });
    }

}
