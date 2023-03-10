package com.xworkz.java.rules;

public class ExamRunner {

	public static void main(String[] args) {
		ExamRule rule = new CollegeStudent();

		College college = new College(rule);
		college.ExamRule();
	}

}
