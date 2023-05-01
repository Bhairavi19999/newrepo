package com.xworkz.hair.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.hair.conf.HairConfi;
import com.xworkz.hair.thing.Barber;
import com.xworkz.hair.thing.Chair;
import com.xworkz.hair.thing.HairDryer;
import com.xworkz.hair.thing.Mirror;
import com.xworkz.hair.thing.Saloon;
import com.xworkz.hair.thing.Scissor;
import com.xworkz.hair.thing.ShavingCream;
import com.xworkz.hair.thing.Trimmer;

public class HairRunner {

	public static void main(String[] args) {
		ApplicationContext ref = new AnnotationConfigApplicationContext(HairConfi.class);
		int counts = ref.getBeanDefinitionCount();
		System.out.println("bean count: " + counts);
		String[] beans = ref.getBeanDefinitionNames();
		Stream.of(beans).forEach(System.out::println);

		Saloon Saloon = ref.getBean(Saloon.class);
		System.out.println(Saloon);
		System.out.println("                                ");

		Scissor scissor = ref.getBean(Scissor.class);
		System.out.println(scissor);
		System.out.println("                                ");

		Barber barber = ref.getBean(Barber.class);
		System.out.println(barber);
		System.out.println("                                ");

		Chair chair = ref.getBean(Chair.class);
		System.out.println(chair);
		System.out.println("                                ");

		HairDryer hairDryer = ref.getBean(HairDryer.class);
		System.out.println(hairDryer);
		System.out.println("                                ");

		Mirror mirror = ref.getBean(Mirror.class);
		System.out.println(mirror);
		System.out.println("                                ");

		ShavingCream shavingCream = ref.getBean(ShavingCream.class);
		System.out.println(shavingCream);
		System.out.println("                                ");

		Trimmer trimmer = ref.getBean(Trimmer.class);
		System.out.println(trimmer);
		System.out.println("                                ");

	}

}
