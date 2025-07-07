package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LimitsServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
		System.out.println("Application starting............");
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LimitsServiceApplication.class);
	}

}
