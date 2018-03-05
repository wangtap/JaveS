package com.lanou.admin_info.controller;

import com.lanou.admin_info.dao.Admin_infoMapper;
import com.lanou.admin_info.domain.Admin_info;
import com.lanou.admin_info.domain.Admin_infoPageBean;
import com.lanou.admin_info.domain.ExtendAdmin_info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin_info")
public class Admin_infoController {
    private int pageSide=5;

    @Resource
    private Admin_infoMapper admin_infoMapper;



    @RequestMapping("/findAll")
    public String findAll(Model model){
        int totalData = admin_infoMapper.findTotalData();
        Admin_infoPageBean admin_infoPageBean = new Admin_infoPageBean(1,totalData,pageSide);
        List<ExtendAdmin_info> extendAdmin_infos = admin_infoMapper.findAllByPage(admin_infoPageBean);
        System.out.println(extendAdmin_infos.toString());
        admin_infoPageBean.setData(extendAdmin_infos);
        model.addAttribute("admin_infoPageBean",admin_infoPageBean);
        return "/admin/admin_list";
    }

    @RequestMapping("/findAllByPage")
    public String findAllByPage(Model model ,Admin_infoPageBean pageBean){
        System.out.println(pageBean.toString());
        int totalData = admin_infoMapper.findTotalData();
        if (pageBean.getPageCode()==0){
            pageBean.setPageCode(1);
        }
        Admin_infoPageBean admin_infoPageBean = new Admin_infoPageBean(pageBean.getPageCode(),totalData,pageSide);
        List<ExtendAdmin_info> ExtendAdmin_infos = admin_infoMapper.findAllByPage(admin_infoPageBean);
        System.out.println(ExtendAdmin_infos.toString());
        admin_infoPageBean.setData(ExtendAdmin_infos);
        model.addAttribute("admin_infoPageBean",admin_infoPageBean);
        return "/admin/admin_list";
    }

    @RequestMapping("/resetPassword")
    @ResponseBody
    public Map<String ,Object> resetPassword(@RequestParam("ids") String ids){
        Map<String ,Object> param=new HashMap<>();
        param.put("ids",buildIdList(ids));
        param.put("password","123456");
        admin_infoMapper.updatePassword(param);

        Map<String,Object> info=new HashMap<String ,Object>();
        info.put("success",true);
        info.put("message","密码重置成功");
        return info;
    }

    private List<Integer> buildIdList(String ids) {
        if (ids==null||ids.length()==0)
        return null;
        List<Integer> list=new ArrayList<Integer>();
        String[] idsArray=ids.split(",");
        for (String id : idsArray){
            list.add(Integer.valueOf(id));
        }
        return list;
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "/admin/admin_add";
    }

    @RequestMapping("/insert")
    public String insert(ExtendAdmin_info extendRoleInfo){
        admin_infoMapper.insertSelective(extendRoleInfo);
        admin_infoMapper.insertAdminRole(extendRoleInfo);
        return "redirect:findAll";
    }



    @RequestMapping("/toUpdate")
    public String toUpdate(@RequestParam("adminId")int adminId,Model model){
        Admin_info extendAdminInfo = admin_infoMapper.selectByPrimaryKey(adminId);
        model.addAttribute("extendAdminInfo",extendAdminInfo);
        return "/admin/admin_update";
    }

    @RequestMapping("/update")
    public String Update(ExtendAdmin_info extendRoleInfo){
        System.out.println(extendRoleInfo.toString());
        admin_infoMapper.updateByPrimaryKeySelective(extendRoleInfo);
        admin_infoMapper.deleteAdminRole(extendRoleInfo.getAdminId());
//        for (Integer integer : extendRoleInfo.getRoleIds()) {
//            Admin_infoMapper.updateByRoleModule(extendRoleInfo.getRoleId(),integer);
//        }
        admin_infoMapper.insertAdminRole(extendRoleInfo);
        return "redirect:findAll";
    }
    @RequestMapping("/delete")
    public String delete(int adminId){
        admin_infoMapper.deleteAdminRole(adminId);
        admin_infoMapper.deleteByPrimaryKey(adminId);
        return "redirect:findAll";
    }
}
