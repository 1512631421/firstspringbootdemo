package com.example.controller;

import com.example.bean.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MyController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/login")
    public String sayHello(){
        System.out.println("查看页面");
        return "login";
    }

    @RequestMapping(value = "/getInfo",method = RequestMethod.POST)
    public String getInfo(String name){
        Student student = studentService.showInfo(name);
        System.out.println(student.toString());
        System.out.println("hello");
        return "show";
    }
}
