package com.example.demo.service.impl;

import com.example.demo.api.BaiduApi;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private BaiduApi baiduApi;

    @Override
    public Student queryInfoById(Integer id) {
        Student student = studentMapper.queryInfoById(id);
        return student;
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insertSelective(student);
    }
}
