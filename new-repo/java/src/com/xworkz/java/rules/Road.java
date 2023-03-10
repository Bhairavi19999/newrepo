package com.xworkz.java.rules;

public class Road {
	public HoliRule holiRule;

	public Road(HoliRule holiRule) {
		this.holiRule = holiRule;
	}

	public void holirule() {
		boolean color = this.holiRule.chemicalcolors();
		System.out.println("is chemical colors are using:" + color);
		boolean harm = this.holiRule.harmful();
		System.out.println("holi is harmful:" + harm);
	}
}
