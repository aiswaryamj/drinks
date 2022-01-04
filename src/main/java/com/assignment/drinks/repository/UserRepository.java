package com.assignment.drinks.repository;

import com.assignment.drinks.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Long> {

}
