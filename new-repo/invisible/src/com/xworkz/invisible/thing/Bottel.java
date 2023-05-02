package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bottel {
	@Value("whale")
	private String brand;
	@Value("water bottle")

	private String type;
	@Value("100")

	private double cost;
	@Value("100")

	private double cost1;
	@Value("10")

	private double cost2;
	@Value("200")

	private double cost3;
	@Value("300")

	private double cost4;
	@Value("500")

	private double cost5;
	@Value("600")

	private double cost6;
	@Value("700")

	private double cost7;
	@Value("9.6")

	private double heigth;
	@Value("1.2")

	private double weigth;

	public String color() {
		System.out.println("running color in bottel");
		return "purple";
	}

	@Override
	public String toString() {
		return "Bottel [brand=" + brand + ", type=" + type + ", cost=" + cost + ", cost1=" + cost1 + ", cost2=" + cost2
				+ ", cost3=" + cost3 + ", cost4=" + cost4 + ", cost5=" + cost5 + ", cost6=" + cost6 + ", cost7=" + cost7
				+ ", heigth=" + heigth + ", weigth=" + weigth + "]";
	}
}
