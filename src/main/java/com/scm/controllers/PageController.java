package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

        return "services";
    }

    // contact page

         @GetMapping("/contact")
    public String contact(){
        return new String("contact");
    }


    @GetMapping("/login")
    public String login(){
        return new String("login");
    }

    
    @GetMapping("/register")
    public String register(){
        return "register";
    }

}
