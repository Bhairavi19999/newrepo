package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Scissor {
	private String type;
	@Value("0.5")

	private double weight;
	@Value("purple")
	private String color;

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", color=" + color + "]";
	}

	public Scissor(@Value("metal") String type) {
		this.type = type;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
