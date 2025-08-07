package com.cognizant.spring_learn.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.model.Department;

@Repository
public class DepartmentDao {

	private static ArrayList<Department> department_list;
	public DepartmentDao(@Qualifier("departmentList") ArrayList<Department> departmentList) {
		
		department_list=departmentList;
		
	}
	public ArrayList<Department> getAllDepartments()
	{
		return department_list;
	}
	

}
