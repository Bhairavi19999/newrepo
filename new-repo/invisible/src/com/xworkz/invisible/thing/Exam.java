package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Exam {
	@Value("SSLC")
	private String name;
	@Value("PUC")
	private String name2;
	@Value("BSC")
	private String name3;
	@Value("MCOM")
	private String name4;
	@Value("MSC")
	private String name5;
	@Value("BCOM")
	private String name6;
	@Value("BE")
	private String name7;
	@Value("BBA")
	private String name8;
	@Value("ARTS")
	private String name9;
	@Value("MCA")
	private String name10;
	@Value("tumkur")

	private String location;
	@Value("mathS")

	private String subject;
	@Value("2")

	private int semister;
	@Value("100")

	private int marks;
	@Value("3")

	private int hours;

	public int totalstudents() {
		System.out.println("running totalstudents in exam");
		return 100;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + ", name5=" + name5
				+ ", name6=" + name6 + ", name7=" + name7 + ", name8=" + name8 + ", name9=" + name9 + ", name10="
				+ name10 + ", location=" + location + ", subject=" + subject + ", semister=" + semister + ", marks="
				+ marks + ", hours=" + hours + "]";
	}

}
