package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {
	private String color;
	@Value("round")
	private String shape;
	@Value("sitting")
	private String type;

	public Chair(@Value("pink") String color) {
		this.color = color;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chair [color=" + color + ", shape=" + shape + ", type=" + type + "]";
	}

}
