package com.example.demo.controller;

import com.example.demo.api.BaiduApi;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fox
 */

@RequestMapping("/check")
@RestController
public class CheckController {

    @Resource
    private BaiduApi baiduApi;

    @Resource
    private StudentService studentService;

    @GetMapping
    public Map check() {
        Map<String, String> info = new HashMap<>();
        info.put("hello", "world");
        return info;
    }


}
