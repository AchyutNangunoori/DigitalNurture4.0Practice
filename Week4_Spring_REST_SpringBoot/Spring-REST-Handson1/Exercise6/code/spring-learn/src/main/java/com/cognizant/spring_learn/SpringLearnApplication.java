package com.cognizant.spring_learn;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountries();
	}
	
	public static void displayCountries()
	{
		
		LOGGER.info("start...");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		
		List<Country> countries=context.getBean("countries",ArrayList.class);
		LOGGER.debug(countries.toString());
		
		LOGGER.info("end...");
		
	}
}