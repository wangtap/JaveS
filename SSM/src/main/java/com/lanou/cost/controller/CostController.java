package com.lanou.cost.controller;


import com.lanou.cost.dao.CostMapper;
import com.lanou.cost.domain.Cost;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Controller
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

}
