package com.xworkz.java.rules.imp;

import com.xworkz.java.rules.GoldSeller;

public class Mahalakshmi implements GoldSeller {
	public Mahalakshmi() {
		System.out.println("running GoldSeller in Mahalakshmi ");
	}

	@Override
	public double pricePerGram() {
		System.out.println("running  in pricePerGram in Mahalakshmi");
		return 4500;
	}

	@Override
	public String getGstNo() {
		System.out.println("running  in pricePerGram in Mahalakshmi");
		return "19AAACC4175DZ2";
	}

	@Override
	public String getLocation() {
		System.out.println("running  in pricePerGram in Mahalakshmi");
		return "gubbi";
	}

}
