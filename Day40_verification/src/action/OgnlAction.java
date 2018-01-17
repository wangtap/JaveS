package action;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;

public class OgnlAction extends ActionSupport {

        private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(student);
        return super.execute();
    }

    public  String ognl(){
            System.out.println(student);
            return SUCCESS;
        }
}
