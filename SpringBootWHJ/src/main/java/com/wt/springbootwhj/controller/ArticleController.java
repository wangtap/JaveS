package com.wt.springbootwhj.controller;



import com.wt.springbootwhj.domain.Article;
import com.wt.springbootwhj.service.WYJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;


@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
public class ArticleController {
    @Autowired
    @Qualifier("wyjService")
    private WYJService wyjService;

    //查询所有商品
    @RequestMapping(value = "/select")
    @ResponseBody
    public Object select() throws IOException {
        List<Article> list = wyjService.selectAll();
        return list;
    }

    //获取热门商品
    @RequestMapping(value = "/selectByHot")
    @ResponseBody
    public Object selectArticleByHot() throws IOException {
        List<Article> list = wyjService.selectArticleByHot(2);
        return list;
    }

    @RequestMapping(value = "/selectById")
    @ResponseBody
    public Object selectArticeById(int id) throws IOException {
        Article article = wyjService.selectArticeById(id);
        return article;
    }

    @RequestMapping(value = "/selectByType")
    @ResponseBody
    public Object selectArticeName(int type) throws IOException{
        List<Article> articles = wyjService.selectArticeType(type);
        return articles;
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("toPro_list")
        public String pro_list(int type, Model model){
            System.out.println(type);
            model.addAttribute("type",type);
            return "pro_list";
    }

    @RequestMapping("Pro_list")
    public String pro_list() {

        return "pro_list";
    }
}
