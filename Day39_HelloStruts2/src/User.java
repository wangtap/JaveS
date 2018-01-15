import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {
    /*
    因为对于User 的操作肯定存在增删改查或其他的操作方式
    那么我们可以给UserAction写对应的 方法返回值可以我们自己定义
    在 struts.xml中的result标签中
    可以找到对于的结果就可以了
     */
    public String add(){
        return "add";
    }


    public String move(){
        return "move";
    }

    public String updata(){
        return "updata";
    }


    public String query(){
        return "query";
    }
}
