package com.xworkz.java.rules;

public class CollegeStudent implements ExamRule {
	public CollegeStudent()
	{
		System.out.println("ruuning in CollegeStudent");
	}

	@Override
	public double duration() {
		return 2.45;
	}

	@Override
	public boolean feeStatus() {
		// TODO Auto-generated method stub
		return true;
	}

}
