import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Json  extends ActionSupport{
    public String test() throws IOException {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=UTF-8");
        String name="{'name':'张三'}";
        JSONObject jsonObject = JSONObject.fromObject(name);
        response.getWriter().write(jsonObject.toString());
        response.getWriter().close();


        return SUCCESS;
    }

}
