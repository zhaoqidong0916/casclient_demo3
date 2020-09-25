package com.offcn.demo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取用户名
 */
@RestController
public class UserController {
    @RequestMapping("/findLoginUser")
    public void  findLoginUser(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);



    }

    @RequestMapping("/find")
    public String find(){
        return "haha";
    }

    @RequestMapping("/find")
    public String find1(){
        return "haha";
    }


}
