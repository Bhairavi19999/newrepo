package com.xworkz.java.rules;

public class FarmRunner {

	public static void main(String[] args) {
		FarmRule rule = new Farmer();
		Field field = new Field(rule);
		field.FarmRule();
	}

}
