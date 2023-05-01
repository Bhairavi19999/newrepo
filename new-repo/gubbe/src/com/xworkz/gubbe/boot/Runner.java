package com.xworkz.gubbe.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.gubbe.configuration.SpringConfiguration;
import com.xworkz.gubbe.thing.Dust;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext spring = new 
				AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		int counts=spring.getBeanDefinitionCount();
		System.out.println("bean count: "+counts);
		String[] beans=spring.getBeanDefinitionNames();
		Stream.of(beans).forEach(System.out::println);
		
		Dust dust=spring.getBean(Dust.class);
		System.out.println(dust);
		
		//overloaded getBean()
		System.out.println(spring.getBean(Dust.class));
		
	}

}
