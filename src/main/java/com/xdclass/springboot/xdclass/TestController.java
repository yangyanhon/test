package com.xdclass.springboot.xdclass;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello() {
        User user = new User();
        //language=JSON
        String userStr = "";

        return userStr;
    }

}
