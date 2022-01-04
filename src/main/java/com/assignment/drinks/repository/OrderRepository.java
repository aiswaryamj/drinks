package com.assignment.drinks.repository;

import com.assignment.drinks.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
