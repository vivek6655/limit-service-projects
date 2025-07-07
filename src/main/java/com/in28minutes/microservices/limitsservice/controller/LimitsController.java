package com.in28minutes.microservices.limitsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.service.LimitService;

@RestController
public class LimitsController {


	@Autowired
	private LimitService limitService;

	
	@GetMapping("/names")
	public List<String> retrieveNames() {
		return limitService.getName();
		
	}
	
	@GetMapping("/namess")
	public List<String> retrieveNamess() {
		return limitService.getName();
		
	}
}
