package com.xworkz.headphone.constants;

public enum WeightAndType {
	BLUETOOTH(30), WIRELESS(50);

	private final double weight;

	private WeightAndType(double weight) {
		this.weight = weight;

	}

	public double getWeight() {
		return weight;
	}

}
