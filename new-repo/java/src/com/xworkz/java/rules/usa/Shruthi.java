package com.xworkz.java.rules.usa;

import com.xworkz.java.rules.GoldSeller;

public class Shruthi {
	public GoldSeller golaGoldSeller;

	public Shruthi(GoldSeller golaGoldSeller) {
		this.golaGoldSeller = golaGoldSeller;
	}

	public void chinnaTago() {
		double price = this.golaGoldSeller.pricePerGram();
		String number = this.golaGoldSeller.getGstNo();
		String location = this.golaGoldSeller.getLocation();
		System.out.println("price of gold is:"+price);
		System.out.println("GST number of gold is:"+number);
		System.out.println("location is:"+location);
		if (price < 4000) {
			System.out.println("Shruthi will buy gold");
		} else {
			System.out.println("Shruthi dont buy gold");

		}
	}

}
