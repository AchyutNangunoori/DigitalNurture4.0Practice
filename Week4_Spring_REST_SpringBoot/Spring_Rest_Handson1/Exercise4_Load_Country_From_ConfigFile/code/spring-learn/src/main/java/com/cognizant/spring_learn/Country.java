package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(Country.class);
	
	private String code;
	private String name;
	public Country() {
		LOGGER.debug("inside constructor");
	}
	public String getCode() {
		LOGGER.debug("getter of code");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("setter of code");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("getter of name");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("setter of name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
	
	
}
