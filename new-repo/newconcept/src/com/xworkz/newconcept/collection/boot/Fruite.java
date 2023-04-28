package com.xworkz.newconcept.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fruite {

	public static void main(String[] args) {
		Collection<String> fruit = new ArrayList<>();
		fruit.add("mango");
		fruit.add("apple");
		fruit.add("papaya");
		fruit.add("sugarcane");
		fruit.add("peach");
		fruit.add("pineapple");
		fruit.add("orange");
		fruit.add("watermelon");
		fruit.add("strawberry");
		fruit.add("chiko");
		fruit.add("starfruit");
		fruit.add("guava");
		fruit.add("grapes");
		fruit.add("kiwi");
		fruit.add("gooseberry");
		fruit.add("jackfruit");
		fruit.add("banana");
		fruit.add("cherry");
		fruit.add("blueberry");
		fruit.add("custardapple");
		fruit.add("avocados");
		fruit.add("pomegranate");
		fruit.add("woodapple");
		fruit.add("raspberries");
		fruit.add("dragonfruit");

		fruit.forEach(fru -> System.out.println("fruit is:" + fru));
		System.out.println("fruits in upper case");
		fruit.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("fruits less than 8 letters");
		fruit.stream().filter(ele -> ele.length() < 8).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
		System.out.println("fruits greter than 8 letters");
		fruit.stream().filter(ele -> ele.length() > 8).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
		System.out.println("fruits greter than 10 and less than 6 letters");
		fruit.stream().filter(ele -> (ele.length() < 10 && ele.length() > 6)).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
		System.out.println("                    ");

		// email

		Collection<String> mail = new ArrayList<>();
		mail.add("bhairavi@gmail.com");
		mail.add("geetha@gmail.com");
		mail.add("inchara@gmail.com");
		mail.add("adhi@gmail.com");
		mail.add("latha@gmail.com");
		mail.add("savitha@outlook.com");
		mail.add("kavitha@outlook.com");
		mail.add("manju@outlook.com");
		mail.add("reethu@outlook.com");
		mail.add("kiran@outlook.com");
		mail.add("punith@yahoo.com");
		mail.add("lokesh@yahoo.com");
		mail.add("pradeep@yahoo.com");
		mail.add("dileep@yahoo.com");
		mail.add("sandeep@yahoo.com");
		mail.add("sudeesh@xworkz.com");
		mail.add("priya@xworkz.com");
		mail.add("rekha@xworkz.com");
		mail.add("ramya@xworkz.com");
		mail.add("rakshitha@xworkz.com");
		mail.add("radha@xworkz.com");
		mail.add("swmya@xworkz.com");
		mail.add("vedha@xworkz.com");
		mail.add("vidya@xworkz.com");
		mail.add("samraksha@xworkz.com");
		mail.forEach(e -> System.out.println("emails are:" + e));
		System.out.println("emails in upper case");
		mail.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("        ");
		System.out.println("CONTAINS GAMIL");
		mail.stream().filter(e -> e.contains("gmail")).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("        ");
		System.out.println("CONTAINS XWORKZ");
		mail.stream().filter(e -> e.contains("xworkz")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("        ");
		System.out.println("which is not gamil and xworkz ");
		mail.stream().filter(e -> (!e.contains("xworkz") && !e.contains("gmail"))).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("        ");
		System.out.println("UNIQ DOMAIN ONLY");
		mail.stream().map(e -> e.split("@")[1]).collect(Collectors.toSet()).forEach(e -> System.out.println(e));
		System.out.println("            ");
		System.out.println("WITHOUT DOMAIN");
		mail.stream().map(e -> e.split("@")[0]).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("                 ");
		System.out.println("SORTING");
		mail.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println("                 ");
		System.out.println("SORTING IN NUMBERS");
		Stream.of(1,2,3,4,5,6,7,8,9).sorted((q,p)->p.compareTo(q)).forEach(e->System.out.println(e));
			
		

	}

}
