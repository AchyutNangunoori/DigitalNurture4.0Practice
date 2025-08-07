package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;

@RestController
public class CountryController {

	@GetMapping("/countries")
	public List<Country> getAllCountries()
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		
		@SuppressWarnings("unchecked")
		List<Country> countries=context.getBean("countries",List.class);
		
		return countries;
	}
	
}
