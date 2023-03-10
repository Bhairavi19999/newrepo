package com.xworkz.java.rules.imp;

import com.xworkz.java.rules.GoldSeller;

public class Abharan implements GoldSeller {
	public Abharan() {
		System.out.println("running GoldSeller in Abharan");
	}

	@Override
	public double pricePerGram() {
		System.out.println("running pricePerGram in Abharan ");
		return 5500;
	}

	@Override
	public String getGstNo() {
		System.out.println("running getGstNo in Abharan ");
		return "24AAACC4175D1Z4";
	}

	@Override
	public String getLocation() {
		System.out.println("running getLocation in Abharan ");
		return "banglore";
	}

}
