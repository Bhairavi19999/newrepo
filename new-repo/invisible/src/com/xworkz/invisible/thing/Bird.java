package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bird {
	@Value("peacock")
	private String name;
	@Value("peacock")
	private String name1;
	@Value("cock")
	private String name2;
	@Value("parrot")
	private String name3;
	@Value("eagle")
	private String name4;
	@Value("crow")
	private String name5;
	@Value("duck")
	private String name6;
	@Value("dove")
	private String name7;
	@Value("goose")
	private String name8;
	@Value("pigen")
	private String name9;
	@Value("blue")
	private String color;
	@Value("1200")
	private double cost;
	@Value("3.5")
	private double weigth;
	@Value("7.9")
	private double heigth;

	public String gender() {
		System.out.println("running gender in bird");
		return "male";
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4
				+ ", name5=" + name5 + ", name6=" + name6 + ", name7=" + name7 + ", name8=" + name8 + ", name9=" + name9
				+ ", color=" + color + ", cost=" + cost + ", weigth=" + weigth + ", heigth=" + heigth + "]";
	}

	
}
