package com.lanou.service.controller;

import com.lanou.account.domain.Account;
import com.lanou.cost.domain.Cost;
import com.lanou.service.dao.ServiceMapper;
import com.lanou.service.domain.ExtendService;
import com.lanou.service.domain.Service;
import com.lanou.service.domain.ServicePageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    private int pageSide=5;

    @Resource
    private ServiceMapper serviceMapper;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        int totalData = serviceMapper.findTotalData();
        ServicePageBean servicePageBean = new ServicePageBean(1,totalData,pageSide);
        List<ExtendService> extendServices = serviceMapper.findAll(servicePageBean);
        System.out.println(extendServices.toString());
        servicePageBean.setData(extendServices);
        model.addAttribute("servicePageBean",servicePageBean);
        return "/service/service_list";
    }

    @RequestMapping("/findAllByPage")
    public String findAllByPage(Model model ,ServicePageBean pageBean){
        System.out.println(pageBean.toString());
        int totalData = serviceMapper.findTotalData();
        if (pageBean.getPageCode()==0){
            pageBean.setPageCode(1);
        }
        ServicePageBean servicePageBean = new ServicePageBean(pageBean.getPageCode(),totalData,pageSide);
        List<ExtendService> extendServices = serviceMapper.findAllByPage(servicePageBean);
        servicePageBean.setData(extendServices);
        model.addAttribute("servicePageBean",servicePageBean);
        return "/service/service_list";
    }

    //开启
    @RequestMapping("/startAccount")
    public String updateStart(@RequestParam("serviceId") int id) {
//暂停账务账号
        Service a = new Service();
        a.setAccountId(id);
        a.setStatus("0");
        serviceMapper.updateStatus(a);
        return "redirect:findAll";
    }
    //暂停
    @RequestMapping("/pauseAccount")
    public String updatePause(@RequestParam("serviceId") int id) {
//暂停账务账号
        Service a = new Service();
        a.setServiceId(id);
        a.setStatus("1");
        serviceMapper.updateStatus(a);
        return "redirect:findAll";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "/service/service_add";
    }

    @RequestMapping("/insert")
    public String insert(ExtendService extendService){
        extendService.setStatus("1");
        serviceMapper.insertSelective(extendService);
        return "redirect:findAll";
    }

    @RequestMapping("/findByIdcardNo")
    @ResponseBody
    public Account  findByIdcardNo(@RequestParam("idcardNo") String idcardNo){
        Account byIdcardNo = serviceMapper.findByIdcardNo(idcardNo);
        System.out.println(byIdcardNo.toString());
        return byIdcardNo;
    }

    @RequestMapping("/findAllCost")
    @ResponseBody
    public List<Cost>  findAllCost(){
        List<Cost> allCost = serviceMapper.findAllCost();
        return allCost;
    }


    @RequestMapping("/toUpdate")
    public String toUpdate(int serviceId,Model model){
        System.out.println(serviceId);
        Service Service = serviceMapper.selectByPrimaryKey(serviceId);
        System.out.println(Service.toString());
        model.addAttribute("Service",Service);
        return "/service/service_update";
    }

    @RequestMapping("/update")
    public String Update(ExtendService extendService){
        System.out.println(extendService.toString());
        serviceMapper.updateByPrimaryKeySelective(extendService);
        return "redirect:findAll";
    }
    @RequestMapping("/delete")
    public String delete(int serviceId){
        serviceMapper.deleteByPrimaryKey(serviceId);
        return "redirect:findAll";
    }
}
