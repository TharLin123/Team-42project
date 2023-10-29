package com.ncs.nhps.prescriptionmicroservice;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrescriptionmicroserviceApplication {

	public static Logger logger = LoggerFactory.getLogger(PrescriptionmicroserviceApplication.class);
	@PostConstruct
	public void init() {
		logger.info("Prescription Microservice Started");
	}
	public static void main(String[] args) {
		SpringApplication.run(PrescriptionmicroserviceApplication.class, args);
	}

}
