package action;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelAction  extends ActionSupport implements ModelDriven<Student>{
//    这里给泛型Student
//    模型驱动就知道了，是要给Student赋予各种属性

    //模型驱动不会帮助我们创建Students对象
//    需要我们手动创建
    private Student student=new Student();



    public  String model(){
        System.out.println(student);
        return SUCCESS;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Student getModel() {
//        需要在这里将模型返回

        return student;
    }
}
