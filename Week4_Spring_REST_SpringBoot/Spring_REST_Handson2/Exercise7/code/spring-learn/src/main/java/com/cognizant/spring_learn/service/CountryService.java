package com.cognizant.spring_learn.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;



@Service
public class CountryService {
	
	public Country getCountry()
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=context.getBean("country1",Country.class);

		return country;
	}

	public Country getCountryByCode(String code) throws CountryNotFoundException {
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		List<Country> countries=context.getBean("countries",ArrayList.class);
		
		for(Country c:countries)
		{
			if(c.getCode().equals(code))
				return c;
		}

		throw new CountryNotFoundException();
	}

}