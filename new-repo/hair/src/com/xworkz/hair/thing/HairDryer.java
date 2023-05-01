package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {
	private String brand;
	@Value("water")
	private String type;
	@Value("red")
	private String color;
	@Value("1")

	private double weight;
	@Value("100")

	private int rpm;

	public HairDryer(@Value("LG") String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", color=" + color + ", weight=" + weight + ", rpm="
				+ rpm + "]";
	}

}
