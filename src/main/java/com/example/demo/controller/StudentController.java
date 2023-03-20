package com.example.demo.controller;


import com.alibaba.fastjson.JSON;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/student")
@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/queryById")
    public String queryById(@RequestParam("id") Integer id) {
        Student student = studentService.queryInfoById(id);
        return JSON.toJSONString(student);
    }
}
