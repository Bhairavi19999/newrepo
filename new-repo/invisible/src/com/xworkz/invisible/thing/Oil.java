package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Oil {
	@Value("coconut")
	private String name;
	@Value("plam")
	private String name1;
	@Value("groundnut")
	private String name2;

	@Value("sunflower")
	private String name3;
	@Value("musturd")
	private String name4;
	@Value("200")
	private int cost;
	@Value("100")
	private int cost1;
	@Value("400")
	private int cost2;
	@Value("500")
	private int cost3;
	@Value("300")
	private int cost4;
	@Value("pooja")
	private String purpose;
	@Value("cooking")
	private String purpose1;
	@Value("1")
	private double weight;

	public String fuel() {
		System.out.println("running fuel in oil");
		return "petrol";
	}

	@Override
	public String toString() {
		return "Oil [name=" + name + ", name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4
				+ ", cost=" + cost + ", cost1=" + cost1 + ", cost2=" + cost2 + ", cost3=" + cost3 + ", cost4=" + cost4
				+ ", purpose=" + purpose + ", purpose1=" + purpose1 + ", weight=" + weight + "]";
	}

}
