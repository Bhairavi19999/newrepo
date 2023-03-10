package com.xworkz.java.rules.usa;

import com.xworkz.java.rules.GoldSeller;

public class Priyanka {
	public GoldSeller golaGoldSeller;

	public Priyanka(GoldSeller golaGoldSeller) {
		this.golaGoldSeller = golaGoldSeller;
	}

	public void purchaseGold() {
		double price = this.golaGoldSeller.pricePerGram();
		String number = this.golaGoldSeller.getGstNo();
		String location = this.golaGoldSeller.getLocation();
		System.out.println("price of gold is:" + price);
		System.out.println("GST number of gold is:" + number);
		System.out.println("location is:" + location);
		if (price < 4500) {
			System.out.println("Priyanka will buy gold");
		} else {
			System.out.println("Priyanka dont buy gold");

		}
	}

}
