package com.xworkz.java.rules.usa;

import com.xworkz.java.rules.GoldSeller;

public class Anitha {
	public GoldSeller golaGoldSeller;

	public Anitha(GoldSeller golaGoldSeller) {
		this.golaGoldSeller = golaGoldSeller;
	}

	public void buyGold() {
		double price = this.golaGoldSeller.pricePerGram();
		String number = this.golaGoldSeller.getGstNo();
		String location = this.golaGoldSeller.getLocation();
		System.out.println("price of gold is:" + price);
		System.out.println("GST number of gold is:" + number);
		System.out.println("location is:" + location);
		if (price < 5000) {
			System.out.println("Anitha will buy gold");
		} else {
			System.out.println("Anitha dont buy gold");

		}
	}

}
