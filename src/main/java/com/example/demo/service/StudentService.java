package com.example.demo.service;

import com.example.demo.model.Student;

/**
 * @author fox
 */

public interface StudentService {


    Student queryInfoById(Integer id);

    void insertStudent(Student student);

}
