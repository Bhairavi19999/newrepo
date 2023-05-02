package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Function {
	@Value("nameing cermany")
	private String name;
	@Value("12.500")

	private double budget;
	@Value("banglore")

	private String location;
	@Value("tumkur")

	private String location1;
	@Value("raichur")

	private String location2;
	@Value("gubbi")

	private String location3;
	@Value("nittur")

	private String location4;
	@Value("arsikere")

	private String location5;
	@Value("tiptur")

	private String location6;
	@Value("shivamoga")

	private String location7;
	@Value("saklespura")

	private String location8;
	@Value("raichur")

	private String location9;
	@Value("muslim")

	private String religion;
	@Value("hindu")

	private String religion1;
	@Value("christn")

	private String religion2;

	public String purpose() {
		System.out.println("running type in function");
		return "happy";
	}

	@Override
	public String toString() {
		return "Function [name=" + name + ", budget=" + budget + ", location=" + location + ", location1=" + location1
				+ ", location2=" + location2 + ", location3=" + location3 + ", location4=" + location4 + ", location5="
				+ location5 + ", location6=" + location6 + ", location7=" + location7 + ", location8=" + location8
				+ ", location9=" + location9 + ", religion=" + religion + ", religion1=" + religion1 + ", religion2="
				+ religion2 + "]";
	}

}
