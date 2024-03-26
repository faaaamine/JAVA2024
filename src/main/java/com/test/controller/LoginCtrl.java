package com.test.controller;

import com.test.entity.Adminuser;
import com.test.service.AdminuserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class LoginCtrl {

    @Resource
    AdminuserService adminuserService;

    @GetMapping("/goLogin")
    public String toLogin() {
        return "login";
        //return "../templates/login.html";
    }

    @PostMapping("/doLogin")
    //public String doLogin(String uName,@RequestParam(value = "pwd") String uPwd){
    public String doLogin(Adminuser adminuser) {
        System.out.println(adminuser.getName() + " ===" + adminuser.getPassword());
        System.out.println("登录处理");

        Adminuser user = adminuserService.getAdminuser(adminuser);
        System.out.println(user);

        if(user== null){

        }
        return "goodsList";
        //return "../templates/goodsList.html";
    }

}
