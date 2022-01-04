package com.assignment.drinks.service;

import com.assignment.drinks.model.*;
import com.assignment.drinks.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DrinksServiceImpl implements DrinksService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    BottleRepository bottleRepository;

    @Autowired
    CrateRepository crateRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderItemRepository  orderItemRepository;

    public List<User> getUsers()
    {
        List<User> userList = new ArrayList<>();
        userRepository.findAll();
        return userList;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<Bottle> getBottles() {
        List<Bottle> bottleList = new ArrayList<>();
        bottleRepository.findAll();
        return bottleList;
    }

    @Override
    public void addBottle(Bottle bottle) {
        bottleRepository.save(bottle);
    }

    @Override
    public List<Crate> getCrates() {
        List<Crate> crateList = new ArrayList<>();
        crateRepository.findAll();
        return crateList;
    }

    @Override
    public void addCrate(Crate crate) {
        crateRepository.save(crate);
    }

    @Override
    public List<OrderItem> getOrderItems() {
        List<OrderItem> orderItemsList = new ArrayList<>();
        orderItemRepository.findAll();
        return orderItemsList;
    }

    @Override
    public void addOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
    }

    @Override
    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public List<Order> getOrders() {
        List<Order> ordersList = new ArrayList<>();
        orderRepository.findAll();
        return ordersList;
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void deleteOrderItems() {
        orderItemRepository.deleteAll();
    }

}
