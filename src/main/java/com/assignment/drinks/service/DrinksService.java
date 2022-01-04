package com.assignment.drinks.service;

import com.assignment.drinks.model.*;

import java.util.List;

public interface DrinksService {


    List<User> getUsers();

    void addUser(User user);

    List<Bottle> getBottles();

    void addBottle(Bottle bottle);

    List<Crate> getCrates();

    void addCrate(Crate crate);

    List<OrderItem> getOrderItems();

    void addOrderItem(OrderItem orderItem);

    void addAddress(Address address);

    List<Order> getOrders();

    void addOrder(Order order);

    void deleteOrderItems();
}
