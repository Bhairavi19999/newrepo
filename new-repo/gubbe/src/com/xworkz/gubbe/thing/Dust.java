package com.xworkz.gubbe.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dt")
public class Dust {

	private String color;
	// @Value("square")
	private String shape;

	public Dust(@Value("pink") String color) {
		System.out.println("running dust");
		this.color = color;
	}

	@Value("square")
	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Dust [color=" + color + ", shape=" + shape + "]";
	}

}
