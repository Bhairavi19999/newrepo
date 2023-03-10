package com.xworkz.java.rules;

public class Player implements CricketRule {
	private String color;

	public Player() {
		System.out.println("no arg const running in player");
	}

	@Override
	public boolean uniform(String color) {
		if (this.color != color && color.equals("red")) {
			System.out.println("red is not uniform color");
			return false;
		} else {
			System.out.println("red is uniform color");
		}
		return true;
	}

	@Override
	public double timeTaken() {
		if (this.color == "red") {
			return 55;
		} else {
			return 44;
		}
	}

}
