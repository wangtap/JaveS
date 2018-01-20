package staff.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import staff.domain.Staff;
import staff.service.Show;

import java.util.List;

public class ShowAction extends ActionSupport {
 Show show= new Show();
    public String show(){
        List<Staff> staffList = this.show.show();
         ServletActionContext.getRequest().setAttribute("staffList",staffList);

        return SUCCESS;
    }

}
