package com.cognizant.spring_learn.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST , reason = "country not found")
public class CountryNotFoundException extends Exception {

	public CountryNotFoundException() {
		super("country not found");
	}

	
	
}
