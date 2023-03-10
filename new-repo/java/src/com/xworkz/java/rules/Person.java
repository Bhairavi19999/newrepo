package com.xworkz.java.rules;

public class Person implements HoliRule {
	public Person() {
		System.out.println("running person");
	}

	@Override
	public boolean chemicalcolors() {
		return false;
	}

	@Override
	public boolean harmful() {
		return false;
	}

}
