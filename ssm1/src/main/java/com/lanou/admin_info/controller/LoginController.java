package com.lanou.admin_info.controller;

import com.lanou.admin_info.dao.Admin_infoMapper;
import com.lanou.admin_info.domain.Admin_info;
import com.lanou.module_info.domain.Module_info;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController  {
    private final static int SUCCESS=0;
    private final static int ADMIN_CODE_ERROR=1;
    private final static int PASSWORD_ERROR=2;
    private final static int iMAGE_CODE_ERROR=3;
    @Resource
    private Admin_infoMapper admin_infoMapper;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login/login";
    }

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "login/index";
    }

    @RequestMapping("/nopower")
    public String nopower(){
        return "nopower";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(
            String adminCode,
            String password ,
            String code,
            HttpSession session
    ){
        System.out.println(adminCode+"------"+password+"=="+code+"-=-=-"+code.equalsIgnoreCase("8251"));
        Map<String,Object> result=new HashMap<String ,Object>();

        String imageCode=(String )session.getAttribute("imageCode");
        if ( !code.equalsIgnoreCase("8251")){
            result.put("flag",iMAGE_CODE_ERROR);
            return result;
        }

    Admin_info adminInfo=admin_infoMapper.findByCode(adminCode);
        if (adminInfo==null){
            result.put("flag",ADMIN_CODE_ERROR);
            return result;
        }else if (!adminInfo.getPassword().equals(password)){
            result.put("flag",PASSWORD_ERROR);
            return result;

        }else {
            System.out.println(adminInfo+"-=-=");
            session.setAttribute("admin",adminInfo);
//            List<Module_info> moduleInfos=admin_infoMapper.findModulesByAdmin(adminInfo.getAdminId());
//            session.setAttribute("allModules",moduleInfos);
            result.put("flag",SUCCESS);
            return  result;
        }
     }

//     public void createImage(
//             HttpServletResponse httpServletResponse
//             ,HttpSession  session
//     )throws Exception{
//                Map<String, BufferedImage> imageMap = ImageUtil.createImage();
//     }
}
