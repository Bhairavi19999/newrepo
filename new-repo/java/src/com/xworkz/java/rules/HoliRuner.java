package com.xworkz.java.rules;

public class HoliRuner {

	public static void main(String[] args) {
		HoliRule rule = new Person();
		Road road = new Road(rule);
		road.holirule();
	}

}
