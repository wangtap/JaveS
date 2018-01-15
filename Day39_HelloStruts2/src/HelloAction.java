import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    public String hello(){

        return SUCCESS;
    }

    @Override
    public String execute() throws Exception {
        return super.execute();
    }
}
