package com.xworkz.java.rules.imp;

import com.xworkz.java.rules.GoldSeller;

public class Malabar implements GoldSeller {
	public Malabar() {
		System.out.println("running goldseller in malabar");
	}

	@Override
	public double pricePerGram() {
		System.out.println("running pricePerGram in Malabar");
		return 3500;
	}

	@Override
	public String getGstNo() {
		System.out.println("running getGstNo in Malabar");
		return "07AAACC4175D1ZW";
	}

	@Override
	public String getLocation() {
		System.out.println("running getLocation in Malabar");
		return "tumkur";
	}

}
