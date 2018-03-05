package com.lanou.cost.controller;


import com.lanou.cost.dao.CostMapper;
import com.lanou.cost.domain.Cost;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/cost")
public class CostController {
    private CostMapper costMapper;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        costMapper = (CostMapper) new ClassPathXmlApplicationContext("springmvc-servlet.xml").getBean(CostMapper.class);
        List<Cost> costs = costMapper.findAll();
        System.out.println(Arrays.toString(costs.toArray()));
        model.addAttribute("costs",costs);
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

}
