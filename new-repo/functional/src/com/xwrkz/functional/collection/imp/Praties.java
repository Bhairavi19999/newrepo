package com.xwrkz.functional.collection.imp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Praties {
	public static void main(String[] args) {
		Collection<String> party = new ArrayList<>();
		party.add("jds");
		party.add("bjp");
		party.add("congress");
		// stream
		System.out.println("stream methos");
		party.stream().map(element -> element.toUpperCase()).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
		System.out.println("        ");

		Collection<Double> per = new ArrayList<>();
		per.add((double) 22);
		per.add((double) 33);
		per.add((double) 34);
		per.add((double) 99);
		per.add((double) 76);
		per.add((double) 88);
		//all elemnts
		per.forEach(e->System.out.println(e));
		System.out.println("above 60 per");
		per.stream().filter(element -> element > 60).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
		System.out.println("below 60 per");
		per.stream().filter(element -> element < 60).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

	}

}
