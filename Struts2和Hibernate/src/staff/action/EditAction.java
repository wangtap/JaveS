package staff.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import staff.domain.Staff;
import staff.service.Show;

import java.util.List;

public class EditAction extends ActionSupport {
   private Show show= new Show();
        private Staff staff;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String edit(){
        show.idet(staff);
        List<Staff> staffList = this.show.show();
        ServletActionContext.getRequest().setAttribute("staffList",staffList);
        return SUCCESS;
    }

    public String save(){

        show.save(staff);
        List<Staff> staffList = this.show.show();
        ServletActionContext.getRequest().setAttribute("staffList",staffList);
        return SUCCESS;
    }
}
