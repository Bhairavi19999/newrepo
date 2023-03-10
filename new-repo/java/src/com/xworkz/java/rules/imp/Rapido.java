package com.xworkz.java.rules.imp;

import com.xworkz.java.rules.Delivery;

public class Rapido implements Delivery {

	@Override
	public double charges() {
		System.out.println("running charges in rapido");
		return 40;
	}

	@Override
	public double timeTaken() {
		System.out.println("running charges in rapido");
		return 70;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("running charges in rapido");
		if (rating == 1) {
			return "basavraj";
		}
		if (rating == 2) {
			return "dinakar";
		}
		if (rating == 3) {
			return "shivu";
		}
		return null;
	}

}
