package com.test.controller;

import com.test.entity.Adminuser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class LoginCtrl {

    @GetMapping("/goLogin")
    public String goLogin() {
        System.out.println("登录回答");
        return "login"; // 返回逻辑视图名，框架会自动解析为实际路径
    }

    @PostMapping("/doLogin")
    public String doLogin(Adminuser adminuser) {
        System.out.println(adminuser.getName() + "===" + adminuser.getPassword());
        System.out.println("登录处理");
        return "goodsList"; // 返回逻辑视图名，框架会自动解析为实际路径
    }
}

