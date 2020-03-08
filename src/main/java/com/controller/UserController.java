package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private String age;
    @Value("${person.sex}")
    private String sex;

    @RequestMapping("/user")
    @ResponseBody
    public String showInfo(){
        Logger logger = LoggerFactory.getLogger(UserController.class);
        logger.info("name:"+name+"   age:"+age);
        return "name:"+name+"   age:"+age;
    }
}
