package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sim {
	@Value("idea")
	private String network;
	@Value("artel")
	private String network1;
	@Value("jio")
	private String network2;
	@Value("100")
	private int cost;
	@Value("500")
	private int cost1;
	@Value("1000")
	private int cost2;
	@Value("2.2")
	private double length;
	@Value("2.2")
	private double length1;
	@Value("2.2")
	private double length2;
	@Value("0.2")
	private double weigth;
	@Value("0.2")
	private double weigth1;
	@Value("0.2")
	private double weigth2;

	public String mobile() {
		System.out.println("running mobile in sim");
		return "vivo";
	}

	@Override
	public String toString() {
		return "Sim [network=" + network + ", network1=" + network1 + ", network2=" + network2 + ", cost=" + cost
				+ ", cost1=" + cost1 + ", cost2=" + cost2 + ", length=" + length + ", length1=" + length1 + ", length2="
				+ length2 + ", weigth=" + weigth + ", weigth1=" + weigth1 + ", weigth2=" + weigth2 + "]";
	}

}
