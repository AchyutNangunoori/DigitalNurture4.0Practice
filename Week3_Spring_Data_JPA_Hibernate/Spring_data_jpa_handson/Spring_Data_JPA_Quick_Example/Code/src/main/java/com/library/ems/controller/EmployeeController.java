package com.library.ems.controller;

import com.library.ems.entity.Employee;
import com.library.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        return repository.findById(id)
                .map(emp -> {
                    emp.setName(updatedEmployee.getName());
                    emp.setEmail(updatedEmployee.getEmail());
                    emp.setDepartment(updatedEmployee.getDepartment());
                    return ResponseEntity.ok(repository.save(emp));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/search")
    public List<Employee> searchByDepartment(@RequestParam String department) {
        return repository.findByDepartment(department);
    }
}
