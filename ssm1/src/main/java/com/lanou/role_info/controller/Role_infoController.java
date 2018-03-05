package com.lanou.role_info.controller;

import com.lanou.role_info.dao.Role_infoMapper;
import com.lanou.role_info.domain.ExtendRole_info;
import com.lanou.role_info.domain.Role_info;
import com.lanou.role_info.domain.Role_infoPageBean;
import com.lanou.role_module.domain.Role_module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/role_info")
public class Role_infoController {
    private int pageSide=5;

    @Resource
    private Role_infoMapper role_infoMapper;



    @RequestMapping("/findAll")
    public String findAll(Model model){
        int totalData = role_infoMapper.findTotalData();
        Role_infoPageBean Role_infoPageBean = new Role_infoPageBean(1,totalData,pageSide);
        List<ExtendRole_info> ExtendRole_infos = role_infoMapper.findAll(Role_infoPageBean);
        System.out.println(ExtendRole_infos.toString());
        Role_infoPageBean.setData(ExtendRole_infos);
        model.addAttribute("Role_infoPageBean",Role_infoPageBean);
        return "/role/role_list";
    }

    @RequestMapping("/findAllByPage")
    public String findAllByPage(Model model ,Role_infoPageBean pageBean){
        System.out.println(pageBean.toString());
        int totalData = role_infoMapper.findTotalData();
        if (pageBean.getPageCode()==0){
            pageBean.setPageCode(1);
        }
        Role_infoPageBean Role_infoPageBean = new Role_infoPageBean(pageBean.getPageCode(),totalData,pageSide);
        List<ExtendRole_info> ExtendRole_infos = role_infoMapper.findAllByPage(Role_infoPageBean);
        System.out.println(ExtendRole_infos.toString());
        Role_infoPageBean.setData(ExtendRole_infos);
        model.addAttribute("Role_infoPageBean",Role_infoPageBean);
        return "/role/role_list";
    }


    @RequestMapping("/toInsert")
    public String toInsert(){
        return "/role/role_add";
    }

    @RequestMapping("/insert")
    public String insert(ExtendRole_info extendRoleInfo){
        role_infoMapper.insertroleInfo(extendRoleInfo);
        role_infoMapper.insertRoleModule(extendRoleInfo);
        return "redirect:findAll";
    }



    @RequestMapping("/toUpdate")
    public String toUpdate(int roleId,Model model){
        Role_info roleInfo = role_infoMapper.selectByPrimaryKey(roleId);
        model.addAttribute("roleInfo",roleInfo);
        return "/role/role_update";
    }

    @RequestMapping("/update")
    public String Update(ExtendRole_info extendRoleInfo){
        System.out.println(extendRoleInfo.toString());
        role_infoMapper.deleteRoleMOdule(extendRoleInfo.getRoleId());
        for (Integer integer : extendRoleInfo.getModuleIds()) {
            role_infoMapper.updateByRoleModule(extendRoleInfo.getRoleId(),integer);
        }
        return "redirect:findAll";
    }
    @RequestMapping("/delete")
    public String delete(int roleId){
        role_infoMapper.deleteRoleMOdule(roleId);
        role_infoMapper.deleteByPrimaryKey(roleId);
        return "redirect:findAll";
    }
}
