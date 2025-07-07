package com.in28minutes.microservices.limitsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;
import com.in28minutes.microservices.limitsservice.service.LimitService;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;
	
	@Autowired
	private LimitService limitService;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	
	
	@GetMapping("/names")
	public List<String> retrieveNames() {
		return limitService.getName();
		
	}
}
