package com.michel.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController{

    @RequestMapping("/")
    public @ResponseBody String index(){
        return "Hello, World. My first spring boot app.";
    }
}