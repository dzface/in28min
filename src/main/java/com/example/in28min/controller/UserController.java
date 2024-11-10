package com.example.in28min.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "login", method = RequestMethod.GET)   // 예제하고 다르게 value를 명시해주어야만 인식
    public String login() {
        return "loginJsp";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    // 예제하고 다르게 value를 명시해주어야만 인식
    public String welcome(@RequestParam(value = "name") String name,
                       @RequestParam(value = "password") String password,
                       ModelMap model) {
        model.put("name", name);
        model.put("password", password);
        return "mainJsp";
    }
}
