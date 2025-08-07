package com.cognizant.spring_learn.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.model.Employee;

@Repository
public class EmployeeDao {
	private static ArrayList<Employee> employee_list;

	public EmployeeDao(@Qualifier("employeeList") ArrayList<Employee> employeeList) {
		employee_list=employeeList;
	}
	public ArrayList<Employee> getAllEmployees()
	{
		return employee_list;
	}
	
	
}
