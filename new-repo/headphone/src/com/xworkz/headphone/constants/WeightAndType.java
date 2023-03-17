package com.xworkz.headphone.constants;

public enum WeightAndType {
	BLUETOOTH(30, 40), WIRELESS(50, 50);

	private final double weight;

	private WeightAndType(double weight, double type) {
		this.weight = weight;

	}

	public double getWeight() {
		return weight;
	}

}
