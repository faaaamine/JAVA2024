package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class HelloWorld {
    @ResponseBody
    @GetMapping("/hello")
    public  String sayHello() { return "Hello world!"; }
    @ResponseBody
    @GetMapping("/aa")
    public String sayHe() { return "你好！"; }
}
