package com.example.in28min.controller;


import com.example.in28min.config.CurrencyServiceConfiguration;
import com.example.in28min.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration retriveAllCourses(){
        return configuration;
    }
}
