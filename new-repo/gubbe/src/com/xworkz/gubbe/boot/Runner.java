package com.xworkz.gubbe.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.gubbe.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext spring = new 
				AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	}

}
