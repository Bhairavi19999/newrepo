package com.xworkz.good.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.good")
public class Springconf {
	public Springconf() {
		System.out.println("running springconf");
	}

}
