package com.assignment.drinks;

import com.assignment.drinks.model.Employee;
import com.assignment.drinks.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DrinksApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrinksApplication.class, args);
    }

//    private void insertFourEmployees(EmployeeRepository repository) {
//        repository.save(new Employee("Dalia", "Abo Sheasha"));
//        repository.save(new Employee("Trisha", "Gee"));
//        repository.save(new Employee("Helen", "Scott"));
//        repository.save(new Employee("Mala", "Gupta"));
//    }

    private void deleteAllEmployees (EmployeeRepository repository) {
        repository.deleteAll();
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
//            insertFourEmployees(repository);
            deleteAllEmployees(repository);
            System.out.println(repository.findAll());
        };
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
