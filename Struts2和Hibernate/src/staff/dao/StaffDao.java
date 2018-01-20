package staff.dao;

import org.hibernate.Query;
import staff.domain.Staff;
import util.HibernateUtil;

import java.util.List;

public class StaffDao {



    public List<Staff> queryAll(){
        List<Staff> staffList = HibernateUtil.handle(session -> {
            Query query = session.createQuery("from " + Staff.class.getName());
            List<Staff> list = query.list();
            return list;
        });
        return staffList;
    }
    public Staff idet(Staff formStaff){
        Staff staff1 = HibernateUtil.handle(session -> {

            Staff staff = session.get(Staff.class, formStaff.getSid());
            staff.setSname

                    (formStaff.getSname());
            staff.setAge(formStaff.getAge());
            staff.setDepartment(formStaff.getDepartment());
            staff.setHiredate(formStaff.getHiredate());
            staff.setAddress(formStaff.getAddress());
            staff.setPhone(formStaff.getPhone());
            session.save(staff);
            return staff;
        });
        return staff1;
    }

    public Staff queryBySid(int sid){
        Staff staff1 = HibernateUtil.handle(session -> {
            Staff staff = session.get(Staff.class, sid);
            return staff;
        });
        return staff1;
    }

    public void save(Staff staff){
        HibernateUtil.handle(session -> {
            System.out.println(staff.toString());
            session.save(staff);
            return null;
        });
    }

}
