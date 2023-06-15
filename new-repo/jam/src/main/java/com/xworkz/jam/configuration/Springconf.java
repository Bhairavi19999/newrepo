package com.xworkz.jam.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.jam")
public class Springconf {
	public Springconf(){
		System.out.println("running springcong");
	}

}
