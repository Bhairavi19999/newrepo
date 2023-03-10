package com.xworkz.java.rules;

public class Farmer implements FarmRule {
	public Farmer() {
		System.out.println("running farmer");
	}

	@Override
	public boolean noFertilizer() {
		return false;
	}

	@Override
	public String soliType() {
		return "red";
	}

}
