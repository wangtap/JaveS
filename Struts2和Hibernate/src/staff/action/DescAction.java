package staff.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import staff.domain.Staff;
import staff.service.Show;

public class DescAction extends ActionSupport {
    Show show=new Show();
private int sid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String desc(){

        Staff staff = show.queryStaffBySid(sid);

        ServletActionContext.getRequest().setAttribute("staff",staff);
            return SUCCESS;
    }
}
