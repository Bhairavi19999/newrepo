package com.xworkz.blooddonation.confi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.blooddonation")
public class Springcon implements WebMvcConfigurer {

	public Springcon() {
		System.out.println("created Springcon");
	}
}
