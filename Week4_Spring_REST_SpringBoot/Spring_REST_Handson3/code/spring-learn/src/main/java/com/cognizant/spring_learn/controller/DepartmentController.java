package com.cognizant.spring_learn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Department;
import com.cognizant.spring_learn.service.DepartmentService;

@RestController
public class DepartmentController {
	
	private final static Logger LOGGER=LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/departments")
	public ArrayList<Department> getAllDepartments()
	{
		LOGGER.info("REST service for departments called..");
		return departmentService.getAllDepartments();
	}
	
}
