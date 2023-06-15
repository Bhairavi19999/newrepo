package com.xworkz.best.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.best")
public class Springconf {

	public Springconf() {
		System.out.println("running spring configuration");
	}

}
