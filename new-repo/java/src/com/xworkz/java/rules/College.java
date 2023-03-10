package com.xworkz.java.rules;

public class College {
	public ExamRule examRule;

	public College(ExamRule examRule) {
		this.examRule = examRule;
	}

	public void ExamRule() {
		double duration = this.examRule.duration();
		System.out.println("time taken is:" + duration);
		boolean fee = this.examRule.feeStatus();
		System.out.println("fee status is:" + fee);
	}

}
