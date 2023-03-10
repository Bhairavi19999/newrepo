package com.xworkz.java.rules;

public class Field {
	public FarmRule farmRule;

	public Field(FarmRule farmRule) {
		this.farmRule = farmRule;
	}

	public void FarmRule() {
		boolean fertilizer = this.farmRule.noFertilizer();
		System.out.println("usage of fertilizer:" + fertilizer);
		String type = this.farmRule.soliType();
		System.out.println("soil type:" + type);
	}

}
