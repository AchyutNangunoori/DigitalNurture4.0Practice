package com.cognizant.spring_learn;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:employee.xml")
public class EmployeeConfig {

}
