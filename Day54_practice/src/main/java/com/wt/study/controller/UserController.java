package com.wt.study.controller;

import com.wt.study.domain.User;
import com.wt.study.domain.UserCustom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 请求json格式数据，返回json
     **/
    @RequestMapping(value = "/login")
    @ResponseBody /*user对象作为json数据返回*/
    public User login(User param) {
        System.out.println(param);
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123");
        return user;
    }

    @RequestMapping(value = "/upload")
    public String uploadFile(MultipartFile items_pic) throws IOException {
        System.out.println("-->>" + items_pic);
//原始名称
        String originalFilename = items_pic.getOriginalFilename();
//上传图⽚片
        if (originalFilename != null && originalFilename.length() > 0) {
//存储图⽚片的物理理路路径
            String pic_path = "C:/Users/lanou3g/Desktop/temp";
//新的图⽚片名称
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            System.out.println(newFileName);
//新图⽚片
            File newFile = new File(pic_path, newFileName);
            System.out.println(newFile.getAbsolutePath());
//保存⽂文件
            items_pic.transferTo(newFile);
        }
        UserCustom custom = new UserCustom();
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123");
        custom.setUser(user);
        return "success";
    }
}