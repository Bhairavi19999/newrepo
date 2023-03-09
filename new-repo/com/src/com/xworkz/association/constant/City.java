package com.xworkz.association.constant;

public class City {
	public String name;
	public String district;
	public String capital;
	public Area area;

	public void setInfo(String name, String district, String capital) {
		this.name = name;
		this.district = district;
		this.capital = capital;

	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void display() {
		System.out.println("name of city is:" + this.name);
		System.out.println("district of city is:" + this.district);
		System.out.println("capital of city is:" + this.capital);
		if (area != null) {
			this.area.show();
		} else {
			System.err.println("this.area is pointing to null....");
		}
		System.out.println("     ");

	}

}
