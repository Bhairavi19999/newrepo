package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Animal {
	private String name;
	@Value("dog")
	private String name1;
	@Value("monkey")
	private String name2;
	@Value("donkey")
	private String name3;
	@Value("horse")
	private String name4;
	@Value("pig")
	private String name5;
	@Value("camle")
	private String name6;
	@Value("snake")
	private String name7;
	@Value("rabbit")
	private String name8;
	@Value("lion")
	private String name9;

	@Value("domestic")
	private String type;
	@Value("1200")
	private int price;
	@Value("white")
	private String color;

	public Animal(@Value("cow") String name) {
		System.out.println("ruuning animal");
		this.name = name;
	}

	public String gender() {
		System.out.println(" gender in animal");
		return "male";
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", name4="
				+ name4 + ", name5=" + name5 + ", name6=" + name6 + ", name7=" + name7 + ", name8=" + name8 + ", name9="
				+ name9 + ", type=" + type + ", price=" + price + ", color=" + color + "]";
	}

}
