package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(){

        System.out.println("Home page handler----------------------------------------------------------------");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
     System.out.print("About Page loading");
     return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services page");

        return "about";
    }

}
