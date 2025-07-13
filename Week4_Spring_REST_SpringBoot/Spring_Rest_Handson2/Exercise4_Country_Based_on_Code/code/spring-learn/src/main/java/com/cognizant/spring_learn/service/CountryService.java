package com.cognizant.spring_learn.service;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

@Service
public class CountryService {
	
	public Country getCountry(String code)
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		List<Country> countries=context.getBean("countries",List.class);
		
		for(Country c: countries)
		{
			if(c.getCode().equalsIgnoreCase(code))
				return c;
		}
		return null;
	}

}
