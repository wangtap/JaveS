package action;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang.StringUtils;

public class SingleValAction extends ActionSupport {
    private String single;

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String single(){
        return SUCCESS;
    }

    //定义一个方法命名方式为：要验证的 validate+方法名
    //这个方法会由struts2帮为我们调用
    //只会验证single方法

    public  void validateSingle(){
        if(StringUtils.isBlank(single)){
            //只要添加了错误信息
            //那么就会将结果改为视图集
        addFieldError(
                "errorMsg","single不能为空"
        );
        }
    }
}
