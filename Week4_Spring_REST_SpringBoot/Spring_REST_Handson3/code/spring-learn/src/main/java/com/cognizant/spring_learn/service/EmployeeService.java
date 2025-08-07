package com.cognizant.spring_learn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.repository.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional(readOnly = true)
	public ArrayList<Employee> getAllEmployees()
	{
		return employeeDao.getAllEmployees(); 
	}
	
}
