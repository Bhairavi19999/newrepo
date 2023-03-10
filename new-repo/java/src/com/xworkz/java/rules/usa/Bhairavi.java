package com.xworkz.java.rules.usa;

import com.xworkz.java.rules.GoldSeller;

public class Bhairavi {
	public GoldSeller golaGoldSeller;

	public Bhairavi(GoldSeller golaGoldSeller) {
		this.golaGoldSeller = golaGoldSeller;
	}

	public void bangaraKaridhi() {
		double price = this.golaGoldSeller.pricePerGram();
		String number = this.golaGoldSeller.getGstNo();
		String location = this.golaGoldSeller.getLocation();
		System.out.println("price of gold is:"+price);
		System.out.println("GST number of gold is:"+number);
		System.out.println("location is:"+location);
		if (price < 6000 && price > 4500) {
			System.out.println("bhairavi will buy gold");
		} else {
			System.out.println("bhairavi dont buy gold");

		}
	}

}
