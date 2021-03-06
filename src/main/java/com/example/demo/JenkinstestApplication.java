package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstestApplication {
	
	private static Logger logger = LoggerFactory.getLogger(JenkinstestApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started........");
		//logger.info("JenkinstestApplication executing in @PostConstruct.......");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinstestApplication.class, args);
	}

}
