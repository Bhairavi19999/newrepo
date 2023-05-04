package com.xworkz.invisible.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.invisible")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("running SpringConfiguration ..");
	}

	@Bean
	public String name() {
		System.out.println("running name in SpringConfiguration...");
		return "ravi";
	}

	@Bean
	public String address() {
		System.out.println("running address in SpringConfiguration...");
		return "ravi";
	}

	@Bean
	public String location() {
		System.out.println("running location in SpringConfiguration...");
		return "gubbi";
	}

	@Bean
	public String flowername() {
		System.out.println("running flowername in SpringConfiguration...");
		return "rose";
	}

	@Bean
	public String fruitname() {
		System.out.println("running fruitname in SpringConfiguration...");
		return "mango";
	}

	@Bean
	public String temple() {
		System.out.println("running temple in SpringConfiguration...");
		return "bhairava";
	}

	@Bean
	public String forest() {
		System.out.println("running forest in SpringConfiguration...");
		return "bandipur";
	}

	@Bean
	public String city() {
		System.out.println("running city in SpringConfiguration...");
		return "banglore";
	}

	@Bean
	public String district() {
		System.out.println("running district in SpringConfiguration...");
		return "hassan";
	}

	@Bean
	public String country() {
		System.out.println("running country in SpringConfiguration...");
		return "india";
	}

	@Bean
	public String taluk() {
		System.out.println("running taluk in SpringConfiguration...");
		return "tumkur";
	}

	@Bean
	public String capital() {
		System.out.println("running capital in SpringConfiguration...");
		return "delhi";
	}

	@Bean
	public String watch() {
		System.out.println("running watch in SpringConfiguration...");
		return "sonata";
	}

	@Bean
	public List<String> drink() {
		List<String> drink = new ArrayList();
		drink.add("cock");
		drink.add("pepsi");
		return drink;

	}

	@Bean
	public ArrayList<String> god() {
		ArrayList<String> god = new ArrayList();
		god.add("shiva");
		god.add("parvati");

		return god;

	}

	@Bean
	public Set rosecolors() {
		Set<String> rosecolors = new TreeSet();
		rosecolors.add("pink");
		rosecolors.add("white");

		return rosecolors;

	}

	@Bean
	public Collection snack() {
		Collection<String> snack = new ArrayList();
		snack.add("chips");
		snack.add("bonda");

		return snack;

	}

	@Bean
	public LinkedList festival() {
		LinkedList<String> festival = new LinkedList();
		festival.add("cock");
		festival.add("pepsi");

		return festival;

	}

	@Bean
	public int rollNo() {
		System.out.println("running int in SpringConfiguration.. ");
		return 104;
	}

	@Bean
	public int age() {
		System.out.println("running int in SpringConfiguration.. ");
		return 14;
	}

	@Bean
	public int kg() {
		System.out.println("running int in SpringConfiguration.. ");
		return 1;
	}

	@Bean
	public int seatno() {
		System.out.println("running int in SpringConfiguration.. ");
		return 100;
	}

	@Bean
	public int beanches() {
		System.out.println("running int in SpringConfiguration.. ");
		return 15;
	}

	@Bean
	public int seats() {
		System.out.println("running int in SpringConfiguration.. ");
		return 200;
	}

	@Bean
	public int homes() {
		System.out.println("running int in SpringConfiguration.. ");
		return 1000;
	}

	@Bean
	public int trains() {
		System.out.println("running int in SpringConfiguration.. ");
		return 204;
	}

	@Bean
	public int bus() {
		System.out.println("running int in SpringConfiguration.. ");
		return 305;
	}

	@Bean
	public boolean well() {
		System.out.println("running boolean in SpringConfiguration..");
		return true;
	}

	@Bean

	public boolean hungry() {
		System.out.println("running boolean in SpringConfiguration..");
		return false;
	}

	@Bean

	public boolean angry() {
		System.out.println("running boolean in SpringConfiguration..");
		return true;
	}

	@Bean

	public boolean coming() {
		System.out.println("running boolean in SpringConfiguration..");
		return false;
	}

	@Bean

	public boolean guilty() {
		System.out.println("running boolean in SpringConfiguration..");
		return true;
	}

	@Bean

	public boolean ironed() {
		System.out.println("running boolean in SpringConfiguration..");
		return false;
	}

	@Bean

	public boolean arrived() {
		System.out.println("running boolean in SpringConfiguration..");
		return true;
	}

	@Bean

	public boolean departed() {
		System.out.println("running boolean in SpringConfiguration..");
		return false;
	}

	@Bean

	public boolean absent() {
		System.out.println("running double in SpringConfiguration..");
		return true;
	}

	@Bean

	public double length() {
		System.out.println("running double in SpringConfiguration..");
		return 5.5;
	}

	@Bean

	public double weight() {
		System.out.println("running double in SpringConfiguration..");
		return 300.5;
	}

	@Bean

	public double breadth() {
		System.out.println("running double in SpringConfiguration..");
		return 3.6;
	}

	@Bean

	public double shoesize() {
		System.out.println("running double in SpringConfiguration..");
		return 10;
	}

	@Bean

	public double pantsize() {
		System.out.println("running double in SpringConfiguration..");
		return 28;
	}

	@Bean

	public double shirtsize() {
		System.out.println("running double in SpringConfiguration..");
		return 34;
	}

	@Bean

	public double slipperSize() {
		System.out.println("running double in SpringConfiguration..");
		return 7.8;
	}

	@Bean

	public double grams() {
		System.out.println("running double in SpringConfiguration..");
		return 405;
	}

	@Bean

	public double volume() {
		System.out.println("running double in SpringConfiguration..");
		return 3.6;
	}

	@Bean

	public long phoneno() {
		System.out.println("running long in SpringConfiguration..");
		return 9966445536L;
	}

	@Bean

	public long phoneno1() {
		System.out.println("running long in SpringConfiguration..");
		return 9966446636L;
	}

	@Bean

	public long phoneno2() {
		System.out.println("running long in SpringConfiguration..");
		return 8866445536L;
	}

	@Bean

	public long phoneno3() {
		System.out.println("running long in SpringConfiguration..");
		return 9933885536L;
	}

	@Bean

	public long phoneno4() {
		System.out.println("running long in SpringConfiguration..");
		return 9966445369L;
	}

	@Bean

	public long phoneno5() {
		System.out.println("running long in SpringConfiguration..");
		return 9961295536L;
	}

	@Bean

	public long phoneno6() {
		System.out.println("running long in SpringConfiguration..");
		return 8615445536L;
	}

	@Bean

	public long phoneno7() {
		System.out.println("running long in SpringConfiguration..");
		return 986445536L;
	}

	@Bean

	public long phoneno8() {
		System.out.println("running long in SpringConfiguration..");
		return 3496445536L;
	}

	@Bean

	public short price() {
		System.out.println("running short in SpringConfiguration..");
		return 5561;
	}

	@Bean

	public short price1() {
		System.out.println("running short in SpringConfiguration..");
		return 30000;
	}

	@Bean

	public short price2() {
		System.out.println("running short in SpringConfiguration..");
		return 4000;
	}

	@Bean

	public short price3() {
		System.out.println("running short in SpringConfiguration..");
		return 9500;
	}

	@Bean

	public short price4() {
		System.out.println("running short in SpringConfiguration..");
		return 3596;
	}

	@Bean

	public short price5() {
		System.out.println("running short in SpringConfiguration..");
		return 9865;
	}

	@Bean

	public short price6() {
		System.out.println("running short in SpringConfiguration..");
		return 6000;
	}

	@Bean

	public short price7() {
		System.out.println("running short in SpringConfiguration..");
		return 3600;
	}

	@Bean

	public short price8() {
		System.out.println("running short in SpringConfiguration..");
		return 9896;
	}

	@Bean

	public float points() {
		System.out.println("running float in SpringConfiguration..");
		return 1.1f;
	}

	@Bean
	public float points1() {
		System.out.println("running float in SpringConfiguration..");
		return 1.2f;
	}

	@Bean
	public float points2() {
		System.out.println("running float in SpringConfiguration..");
		return 1.3f;
	}

	@Bean
	public float points3() {
		System.out.println("running float in SpringConfiguration..");
		return 1.4f;
	}

	@Bean
	public float points4() {
		System.out.println("running float in SpringConfiguration..");
		return 1.5f;
	}

	@Bean
	public float points5() {
		System.out.println("running float in SpringConfiguration..");
		return 1.6f;
	}

	@Bean
	public float points6() {
		System.out.println("running float in SpringConfiguration..");
		return 1.7f;
	}

	@Bean
	public float points7() {
		System.out.println("running float in SpringConfiguration..");
		return 1.8f;
	}

	@Bean
	public float points8() {
		System.out.println("running float in SpringConfiguration..");
		return 1.9f;
	}

	@Bean
	public char start() {
		System.out.println("running char in SpringConfiguration..");
		return 'a';
	}

	@Bean
	public char stop() {
		System.out.println("running char in SpringConfiguration..");
		return 'A';
	}

	@Bean
	public char upper() {
		System.out.println("running char in SpringConfiguration..");
		return 'Z';
	}

	@Bean
	public char lower() {
		System.out.println("running char in SpringConfiguration..");
		return 'z';
	}

	@Bean
	public char star() {
		System.out.println("running char in SpringConfiguration..");
		return '!';
	}

	@Bean
	public char cap() {
		System.out.println("running char in SpringConfiguration..");
		return '@';
	}

	@Bean
	public char equals() {
		System.out.println("running char in SpringConfiguration..");
		return '$';
	}

	@Bean
	public char add() {
		System.out.println("running char in SpringConfiguration..");
		return '*';
	}

	@Bean
	public char minus() {
		System.out.println("running char in SpringConfiguration..");
		return '%';
	}

}
