package com.ee.springboot103;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping("/")
    public String homePage(){
        return "hometemplate";
    }
}
