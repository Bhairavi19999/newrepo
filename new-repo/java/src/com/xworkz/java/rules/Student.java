package com.xworkz.java.rules;

public class Student implements DanceCompetitionRule {
	public Student()
	{
		System.out.println("running in DanceCompetitionRule");
	}

	@Override
	public int timeTaken() {
		return 6;
	}

	@Override
	public String name() {
		return "raj";
	}

}
