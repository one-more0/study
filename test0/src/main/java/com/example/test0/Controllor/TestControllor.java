package com.example.test0.Controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllor {
    @RequestMapping("/")
    public String test(){
        return "-------test---------";
    }
}
