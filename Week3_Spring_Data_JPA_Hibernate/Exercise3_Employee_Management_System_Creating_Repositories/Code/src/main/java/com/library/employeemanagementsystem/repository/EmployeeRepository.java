package com.library.employeemanagementsystem.repository;


import com.library.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query methods
    List<Employee> findByNameContaining(String name);
    List<Employee> findByDepartmentName(String departmentName);
}
