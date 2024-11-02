package com.telusko.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//handle request to home page add @controller
@RestController
public class HomeController {

    // for every request create different  method which will response
    @RequestMapping("/hello")

    // returning data not the page if want page use template or thymeleaf
   // @ResponseBody

    //method
    public String greet(){
        return "welcome to telusko";
    }
    @RequestMapping("/about")
    public String aboutpaget(){
        return "welcome to telusko about page";
    }


}
