package com.assignment.drinks.controller;

import com.assignment.drinks.model.User;
import com.assignment.drinks.repository.DrinksRepository;
import com.assignment.drinks.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DrinksController {

    @GetMapping("/home")
    public ModelAndView getHomePage() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

    @Autowired
    private DrinksRepository drinksRepository;

    @GetMapping({"/list", "/"})
    public ModelAndView getAllUsers() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("users", drinksRepository.findAll());
        return mav;
    }

    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<?> createProduct(@RequestBody User user) {
//        logger.info("Creating Product : {}", product);

//        if (eRepo.isProductExist(user)) {
//            logger.error("Unable to create. A Product with name {} already exist", product.getName());
//            return new ResponseEntity<>(new CustomErrorType("Unable to create. A Product with name " +
//                    product.getName() + " already exist."), HttpStatus.CONFLICT);
//        }
        drinksRepository.saveUser(user);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
