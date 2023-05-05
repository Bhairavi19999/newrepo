package com.xworkz.showroom.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.showroom")
public class ShoeShowRoomConfi {
	public ShoeShowRoomConfi() {
		System.out.println("created ShoeShowRoomConfi using no arg const....");

	}

	@Bean
	public Validator valid() {
		System.out.println("register validator...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}

}
