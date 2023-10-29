package com.ncs.nhps.patientmicroservice;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientmicroserviceApplication {
	public static Logger logger = LoggerFactory.getLogger(PatientmicroserviceApplication.class);
	@PostConstruct
	public void init() {
		logger.info("Patient Microservice Started");
	}
	public static void main(String[] args) {
		SpringApplication.run(PatientmicroserviceApplication.class, args);
	}

}
