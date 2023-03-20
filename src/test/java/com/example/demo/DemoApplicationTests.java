package com.example.demo;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    StudentMapper studentMapper;

    @Test
    void contextLoads() {

//        Student fox = Student.builder().id(10).studentName("fox").classId(1).build();
//
//        int i = studentMapper.insertSelective(fox);
//        System.out.println("111");
//        System.out.println(i);
    }

}
