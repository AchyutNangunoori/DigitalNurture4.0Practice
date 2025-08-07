
package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(CountryController.class);
	
	public CountryController() {
		LOGGER.info("inside the constructor");
	}

	@Autowired
	private CountryService service;
	
	@GetMapping("/country")
	public Country getCountry()
	{
		return service.getCountry();
	}
	
	@GetMapping("/country/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException
	{
		return service.getCountryByCode(code);
	}

}
