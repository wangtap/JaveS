package action;

import com.opensymphony.xwork2.ActionSupport;

public class ResultAction extends ActionSupport {
    public  String plaintext(){
        return SUCCESS;
    }
    public String toGlobal(){
        System.out.println(
                "请求转发到:Global包下的gr"
        );
        return  SUCCESS;
    }
}
