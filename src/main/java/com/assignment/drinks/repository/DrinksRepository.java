package com.assignment.drinks.repository;

import com.assignment.drinks.model.User;
import org.springframework.data.repository.CrudRepository;

public interface DrinksRepository  extends CrudRepository<User,Long> {
    void saveUser(User user);
}
