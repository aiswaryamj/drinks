package com.assignment.drinks.repository;

import com.assignment.drinks.model.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {
}
