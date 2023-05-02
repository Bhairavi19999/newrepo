package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pets {
	@Value("dog")
	private String name;
	@Value("cat")
	private String name2;
	@Value("rabbit")
	private String name3;
	@Value("parrot")
	private String name4;
	@Value("goat")
	private String name5;
	@Value("cow")
	private String name6;
	@Value("buffalow")
	private String name7;
	@Value("1000")
	private int cost;
	@Value("red")
	private String color;
	@Value("6")
	private double wait;
	@Value("true")
	private boolean aggressive;
	@Value("false")
	private boolean aggressive1;

	public String location() {
		System.out.println("ruuning location in pets");
		return "home";
	}

	@Override
	public String toString() {
		return "Pets [name=" + name + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + ", name5=" + name5
				+ ", name6=" + name6 + ", name7=" + name7 + ", cost=" + cost + ", color=" + color + ", wait=" + wait
				+ ", aggressive=" + aggressive + ", aggressive1=" + aggressive1 + "]";
	}

}
