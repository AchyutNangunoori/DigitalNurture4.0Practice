package com.cognizant.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanController {
	@GetMapping("/{number}")
	public Map<String, Object> getAccount(@PathVariable int number) {
		return Map.of(
				"number", number,
				"type", "car",
				"loan", 400000,
				"emi", 3258,
				"tenure", 18);
	}

}
