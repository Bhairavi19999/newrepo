package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	private double weight;
	private double height;
	private String shape;

	private Mirror(@Value("round") String shape) {
		this.shape = shape;

	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Mirror [weight=" + weight + ", height=" + height + ", shape=" + shape + "]";
	}
}
