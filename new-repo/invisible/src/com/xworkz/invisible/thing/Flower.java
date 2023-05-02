package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flower {
	@Value("marigold")
	private String name;
	@Value("rose")

	private String color;
	@Value("100")

	private int cost;
	@Value("1.2")

	private double weigth;
	@Value("2.2")

	private double heigth;
	@Value("daffodil")

	private String name2;
	@Value("dahila")

	private String name3;
	@Value("daisy")

	private String name4;
	@Value("tulip")

	private String name5;
	@Value("lavender")

	private String name6;
	@Value("poppy")

	private String name7;
	@Value("magnolia")

	private String name8;
	@Value("aster")

	private String name9;
	@Value("orchid")

	private String name10;

	public String usedfor() {
		System.out.println("running usedfor in flower");
		return "decoration";
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", color=" + color + ", cost=" + cost + ", weigth=" + weigth + ", heigth="
				+ heigth + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + ", name5=" + name5
				+ ", name6=" + name6 + ", name7=" + name7 + ", name8=" + name8 + ", name9=" + name9 + ", name10="
				+ name10 + "]";
	}

}
