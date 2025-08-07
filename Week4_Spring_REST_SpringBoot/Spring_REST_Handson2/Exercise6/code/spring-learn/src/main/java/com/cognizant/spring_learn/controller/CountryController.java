
package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;

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

}
