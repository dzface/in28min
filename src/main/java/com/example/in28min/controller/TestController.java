package com.example.in28min.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @RequestMapping("/main")
    @ResponseBody //자료형을 페이지 표시하려면 해당 어노테이션 필요
    public String welcome(){
        return "Welcome bro";
    }
}
