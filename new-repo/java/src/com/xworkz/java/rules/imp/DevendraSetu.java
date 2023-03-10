package com.xworkz.java.rules.imp;

import com.xworkz.java.rules.GoldSeller;

public class DevendraSetu implements GoldSeller {
	public DevendraSetu() {
		System.out.println("running GoldSeller in DevendraSetu");
	}

	@Override
	public double pricePerGram() {
		System.out.println("running pricePerGram in DevendraSetu");
		return 5000;
	}

	@Override
	public String getGstNo() {
		System.out.println("running getGstNo in DevendraSetu");
		return "27AAACC4175D1ZY";
	}

	@Override
	public String getLocation() {
		System.out.println("running getLocation in DevendraSetu");
		return "mumbai";
	}

}
