package com.xworkz.java.rules;

public class Stadium {
	public DanceCompetitionRule danceCompetitionRule;

	public Stadium(DanceCompetitionRule danceCompetitionRule) {
		this.danceCompetitionRule = danceCompetitionRule;

	}

	public void danceCompetitionRule() {
		int time = this.danceCompetitionRule.timeTaken();
		System.out.println("timetken is:" + time);
		String name = this.danceCompetitionRule.name();
		System.out.println("name is:" + name);
	}

}
