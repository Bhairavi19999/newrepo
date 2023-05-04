package com.xworkz.musuems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.musuems.thing")
public class MusuemConfig {

	public MusuemConfig() {
		System.out.println("created MusuemConfig");

	}

	@Bean
	public String groupName() {
		System.out.println("running groupName in MusuemConfig");
		return "animals";
	}

	@Bean

	public int totalNo() {
		System.out.println("running totalNo in MusuemConfig");
		return 100;
	}

	@Bean

	public int numberOfBenches() {
		System.out.println("running numberOfBenches in MusuemConfig");
		return 46;
	}

	@Bean

	public int numberOfcells() {
		System.out.println("running numberOfcells in MusuemConfig");
		return 30;
	}

	@Bean

	public double price() {
		System.out.println("running price in MusuemConfig");
		return 1000;
	}

}
