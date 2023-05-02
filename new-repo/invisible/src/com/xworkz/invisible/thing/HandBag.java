package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HandBag {
	@Value("gucci")
	private String brand;
	@Value("prada")

	private String brand1;
	@Value("louis")

	private String brand2;
	@Value("spade")

	private String brand3;
	@Value("hermes")

	private String brand4;
	@Value("chanel")

	private String brand5;
	@Value("ysl")

	private String brand6;
	@Value("fendi")

	private String brand7;
	@Value("caprese")

	private String brand8;
	@Value("fossil")

	private String brand9;
	@Value("1200")

	private double cost;
	@Value("purple")

	private String color;
	@Value("55")

	private int length;
	@Value("1")

	private int weigth;

	public String usedfor() {
		System.out.println("running usedfor in handbag");
		return "carring";
	}

}
