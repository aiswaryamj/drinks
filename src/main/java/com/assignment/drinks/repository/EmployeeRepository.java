package com.assignment.drinks.repository;

import com.assignment.drinks.model.Employee;
import com.assignment.drinks.model.User;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}