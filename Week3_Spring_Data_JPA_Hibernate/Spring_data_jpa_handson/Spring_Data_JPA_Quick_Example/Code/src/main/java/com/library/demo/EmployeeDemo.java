package com.library.demo;


import com.library.ems.entity.Employee;
import com.library.ems.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDemo implements CommandLineRunner {

    private final EmployeeRepository repository;

    public EmployeeDemo(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee(null, "John Doe", "john@example.com", "IT");
        Employee e2 = new Employee(null, "Jane Smith", "jane@example.com", "HR");
        repository.save(e1);
        repository.save(e2);

        List<Employee> all = repository.findAll();
        all.forEach(System.out::println);

        Optional<Employee> employee = repository.findById(1L);
        employee.ifPresent(System.out::println);

        employee.ifPresent(e -> {
            e.setDepartment("Finance");
            repository.save(e);
        });

        List<Employee> hrEmployees = repository.findByDepartment("HR");
        hrEmployees.forEach(System.out::println);

        repository.deleteById(2L);
    }
}
