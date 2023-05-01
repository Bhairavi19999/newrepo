package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {
	private String brand;
	@Value("black")
	private String color;
	@Value("2000")

	private int price;
	@Value("0.3")

	private double height;

	public Trimmer(@Value("vega") String brand) {
		this.brand = brand;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", color=" + color + ", price=" + price + ", height=" + height + "]";
	}

}
