package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShavingCream {
	private String brand;
	private int price;
	private double weight;

	public ShavingCream(@Value("fairnees") String brand) {
		this.brand = brand;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", weight=" + weight + "]";
	}

}
