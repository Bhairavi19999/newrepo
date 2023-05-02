package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bicycle {
	@Value("blacklady")
	private String brand;
	@Value("kids")
	private String type;
	@Value("1200")
	private double price;
	@Value("white")
	private String color;
	@Value("black")
	private String color1;
	@Value("gold")
	private String color2;
	@Value("silver")
	private String color3;
	@Value("blue")
	private String color4;
	@Value("purple")
	private String color5;
	@Value("yellow")
	private String color6;
	@Value("brown")
	private String color7;
	@Value("red")
	private String color8;
	@Value("oilred")
	private String color9;
	@Value("5.5")
	private double weidth;

	public String ownername() {
		System.out.println("running ownername in bicycle");
		return "bhairavi";
	}

	@Override
	public String toString() {
		return "Bicycle [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color + ", color1="
				+ color1 + ", color2=" + color2 + ", color3=" + color3 + ", color4=" + color4 + ", color5=" + color5
				+ ", color6=" + color6 + ", color7=" + color7 + ", color8=" + color8 + ", color9=" + color9
				+ ", weidth=" + weidth + "]";
	}

	

}
