package com.example.demovalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@SpringBootApplication
public class DemoValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoValidationApplication.class, args);
	}


}
