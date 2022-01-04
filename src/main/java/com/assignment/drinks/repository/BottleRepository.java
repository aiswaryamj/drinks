package com.assignment.drinks.repository;

import com.assignment.drinks.model.Bottle;
import org.springframework.data.repository.CrudRepository;

public interface BottleRepository extends CrudRepository<Bottle, Long> {
}
