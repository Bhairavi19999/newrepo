package com.xworkz.java.rules;

public class Ground {
	public CricketRule cricketRule;

	public Ground(CricketRule cricketRule) {
		this.cricketRule = cricketRule;
	}

	public void checkCricketRule() {
		boolean uniform = this.cricketRule.uniform("blue");
		double time = this.cricketRule.timeTaken();
		if (time < CricketRule.DURATION && uniform) {
			System.out.println("match is good");

		} else {
			System.out.println("match is not good");
		}

	}

}
