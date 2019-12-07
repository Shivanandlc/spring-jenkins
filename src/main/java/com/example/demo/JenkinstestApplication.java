package com.example.demo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstestApplication {

	// Logger logger = (Logger) LogFactory.getLog(JenkinstestApplication.class);
	
	private static Logger logger = LoggerFactory.getLogger(JenkinstestApplication.class);
	
	public void init() {
		logger.info("Application started........");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinstestApplication.class, args);
		logger.info("Application executed...........");
		System.out.println("hello jenkins");
	}

}
