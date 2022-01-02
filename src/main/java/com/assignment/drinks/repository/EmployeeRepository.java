package com.assignment.drinks.repository;

import com.assignment.drinks.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findEmployeesByLastNameContaining(String str);
}