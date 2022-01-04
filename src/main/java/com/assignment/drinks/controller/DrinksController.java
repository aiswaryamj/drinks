package com.assignment.drinks.controller;
import com.assignment.drinks.model.*;
import com.assignment.drinks.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrinksController {

    @Autowired
    private DrinksService drinksService;


    @GetMapping("/login")
    public List<User> getUsers()
    {
        return drinksService.getUsers();
    }

    @PostMapping("/login/user")
    public void addUser(@RequestBody User user)
    {
        drinksService.addUser(user);
//        return books.getBookid();
    }

    @GetMapping({"/home","/addBeverage"})
    public List<Bottle> getBottles()
    {
        return drinksService.getBottles();
    }

    @PostMapping("/addBeverage/bottle")
    public void addBottle(@RequestBody Bottle bottle)
    {
        drinksService.addBottle(bottle);
    }

    @GetMapping({"/home","/addBeverage"})
    public List<Crate> getCrates()
    {
        return drinksService.getCrates();
    }

    @PostMapping("/addBeverage/crate")
    public void addCrate(@RequestBody Crate crate)
    {
        drinksService.addCrate(crate);
    }

    @GetMapping("/orderItems")
    public List<OrderItem> getOrderItems()
    {
        return drinksService.getOrderItems();
    }

    @PostMapping("/orderItems/orderItem")
    public void addOrderItem(@RequestBody OrderItem orderItem)
    {
        drinksService.addOrderItem(orderItem);
    }

    @PostMapping("/orderItems/address")
    public void addAddress(@RequestBody Address address)
    {
        drinksService.addAddress(address);
    }

    @GetMapping("/myOrders")
    public List<Order> getOrders()
    {
        return drinksService.getOrders();
    }

    @PostMapping("/orderItems/order")
    public void addOrder(@RequestBody Order order)
    {
        drinksService.addOrder(order);
    }

    @DeleteMapping("/orderItems/")
    public void deleteOrderItems()
    {
        drinksService.deleteOrderItems();
    }

}
