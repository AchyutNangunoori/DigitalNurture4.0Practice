package com.cognizant.spring_learn.service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;



@Service
public class CountryService {
	
	public Country getCountry()
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=context.getBean("country",Country.class);

		return country;
	}

}