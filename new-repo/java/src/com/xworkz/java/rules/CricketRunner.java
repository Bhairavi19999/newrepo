package com.xworkz.java.rules;

public class CricketRunner {

	public static void main(String[] args) {
		CricketRule rule = new Player();
		Ground Ground = new Ground(rule);
		Ground.checkCricketRule();
	}

}
