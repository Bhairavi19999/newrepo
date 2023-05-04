package com.xworkz.musuems.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.musuems.configuration.MusuemConfig;
import com.xworkz.musuems.thing.EntryFee;
import com.xworkz.musuems.thing.MuThing;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(MusuemConfig.class);

		//System.out.println(spring.getBean(MuThing.class));
		System.out.println(spring.getBean(EntryFee.class));

	}

}
