package com.example.in28min.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/login")   // 예제하고 다르게 value를 명시해주어야만 인식
    public String login(@RequestParam(value = "name", required = false) String name, ModelMap model) {
        model.put("name", name);
        logger.debug("This is name {}",name);
        return "loginJspPage";
    }
}
