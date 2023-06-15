package com.xworkz.better.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.better")
public class Springconf {

	public Springconf() {
		System.out.println("running spring configuration");
	}

}