package com.nice.controller;

import com.nice.service.StuService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("stuController")
public class StuController {
    @Resource(name = "stuService")
    private StuService stuService;
    public void save() {
        this.stuService.save();
        System.out.println("StuController执行save方法");
    }
}
