package com.xworkz.invisible.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Glass {
	@Value("buliding")
	private String purpose;
	@Value("hospital")
	private String purpose1;
	@Value("college")
	private String purpose2;
	@Value("school")
	private String purpose3;
	@Value("lab")
	private String purpose4;
	@Value("decoration")
	private String purpose5;
	@Value("utensile")
	private String purpose6;
	@Value("accesriores")
	private String purpose7;
	@Value("11")

	private int length;
	@Value("89")

	private int weidth;
	@Value("3")

	private int thickness;
	@Value("true")

	private boolean transparent;
	@Value("false")

	private boolean transparent1;

	public String color() {
		System.out.println(" running color in  glass");
		return "white";
	}

	@Override
	public String toString() {
		return "Glass [purpose=" + purpose + ", purpose1=" + purpose1 + ", purpose2=" + purpose2 + ", purpose3="
				+ purpose3 + ", purpose4=" + purpose4 + ", purpose5=" + purpose5 + ", purpose6=" + purpose6
				+ ", purpose7=" + purpose7 + ", length=" + length + ", weidth=" + weidth + ", thickness=" + thickness
				+ ", transparent=" + transparent + ", transparent1=" + transparent1 + "]";
	}

}
