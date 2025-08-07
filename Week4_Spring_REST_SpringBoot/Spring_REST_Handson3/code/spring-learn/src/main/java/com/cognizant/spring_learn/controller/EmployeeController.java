package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.service.EmployeeService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	
}
