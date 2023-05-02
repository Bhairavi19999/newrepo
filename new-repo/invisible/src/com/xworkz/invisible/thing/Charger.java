package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Charger {
	@Value("lenovo")
	private String brand;
	@Value("c type")

	private String type;
	@Value("3000")

	private double cost;
	@Value("3000")

	private double cost1;
	@Value("4000")

	private double cost2;
	@Value("5000")

	private double cost3;
	@Value("100")

	private double cost4;
	@Value("2300")

	private double cost5;
	@Value("5600")

	private double cost6;
	@Value("8900")

	private double cost7;
	@Value("1200")

	private double cost8;
	@Value(".5")

	private double weigth;
	@Value("10")

	private double length;

	public String belongsto() {
		System.out.println("running belongsto in charger");
		return "ravi";
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", type=" + type + ", cost=" + cost + ", cost1=" + cost1 + ", cost2=" + cost2
				+ ", cost3=" + cost3 + ", cost4=" + cost4 + ", cost5=" + cost5 + ", cost6=" + cost6 + ", cost7=" + cost7
				+ ", cost8=" + cost8 + ", weigth=" + weigth + ", length=" + length + "]";
	}

}
