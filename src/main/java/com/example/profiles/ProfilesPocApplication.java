package com.example.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProfilesPocApplication {

	private static final Logger logger = LoggerFactory.getLogger(ProfilesPocApplication.class);
	public static void main(String[] args) {
		//test build
		logger.info("Application starts.....");
		SpringApplication.run(ProfilesPocApplication.class, args);
	}

}
