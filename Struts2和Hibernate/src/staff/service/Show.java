package staff.service;

import staff.dao.StaffDao;
import staff.domain.Staff;

import java.util.List;

public class Show {
   StaffDao staffDao= new StaffDao();
   public List<Staff> show(){
       return staffDao.queryAll();
   }

   public Staff idet(Staff staff){
       return staffDao.idet(staff);
   }
   public Staff queryStaffBySid(int sid){
       return staffDao.queryBySid(sid);
   }

   public void save(Staff staff){
       staffDao.save(staff);
   }
}
