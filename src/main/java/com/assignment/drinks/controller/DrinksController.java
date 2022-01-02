package com.assignment.drinks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DrinksController {

    @Controller
    public class Functions {
        @RequestMapping("/")
        public String getHomepage() {
            return "homeTest";
        }
    }

//    @GetMapping("/home")
//    public String index() {
//        ModelAndView mav = new ModelAndView("C:/Users/aishu/Downloads/demo/demo/src/main/resources/api/HomeTest");
//        return mav;
//    }
}
