package com.lanou.cost.controller;


import com.lanou.cost.dao.CostMapper;
import com.lanou.cost.domain.Cost;
import com.lanou.cost.domain.CostPageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/cost")
public class CostController {
    private int pageSide=5;
    @Resource
    private CostMapper costMapper;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        int totalData = costMapper.findTotalData();
        CostPageBean costPageBean = new CostPageBean(1,totalData,pageSide);
          List<Cost> costs = costMapper.findAllByPage(costPageBean);
        costPageBean.setData(costs);
        model.addAttribute("costPageBean",costPageBean);
        return "/cost/cost_list";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "/cost/cost_add";
    }

    @RequestMapping("/insert")
    public String insert(Cost cost){
        cost.setStatus("1");
        cost.setCreatime(new Timestamp(System.currentTimeMillis()));
        costMapper.insertSelective(cost);
        return "redirect:findAll";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        Cost cost = costMapper.selectByPrimaryKey(id);
        model.addAttribute("cost",cost);
        return "/cost/cost_update";
    }

    @RequestMapping("/update")
    public String Update(Cost cost){
        System.out.println(cost.toString());
        costMapper.updateByPrimaryKeySelective(cost);
        return "redirect:findAll";
    }

    @RequestMapping("/delete")
    public String delete(int id){
        costMapper.deleteByPrimaryKey(id);
        return "redirect:findAll";
    }

    @RequestMapping("/findAllByPage")
    public String findAllByPage(Model model ,CostPageBean pageBean){
        int totalData = costMapper.findTotalData();
        CostPageBean costPageBean = new CostPageBean(pageBean.getPageCode(),totalData,pageSide);
        costPageBean.setColumn1(pageBean.getColumn1());
        costPageBean.setS(pageBean.getS());
        System.out.println(costPageBean.toString());
         List<Cost> costs = costMapper.findAllByPage(costPageBean);
        costPageBean.setData(costs);
        model.addAttribute("costPageBean",costPageBean);
        return "/cost/cost_list";
    }








}
