package action;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.struts2.interceptor.validation.SkipValidation;

public class ValidateAction extends ActionSupport {
    private Student student;

    @Override
    public void validate() {
        if(StringUtils.isBlank(
                student.getUsername()
        )){
            addFieldError("errorMsg","不好意思用户名不能为空");
        }
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String val(){
        System.out.println(student);
        return SUCCESS;
    }


    //跳过val1，让validate方法 ，不验证val1
    @SkipValidation
    public String val1(){
        System.out.println(student);
        return SUCCESS;
    }


}
