package com.wt.springbootwhj.controller;


import com.wt.springbootwhj.domain.Comment;
import com.wt.springbootwhj.service.WYJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class CommentController {
    @Autowired
    @Qualifier("wyjService")
    private WYJService wyjService;

    @RequestMapping("selectCommentById")
    public Object selectCommentById(int id){
        List<Comment> comments = wyjService.selectCommentById(id);

        return comments;
    }
}
