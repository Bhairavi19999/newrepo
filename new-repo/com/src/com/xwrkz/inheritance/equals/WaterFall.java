package com.xwrkz.inheritance.equals;

public class WaterFall {
	private String name;
	private double heigth;
	private String location;

	public WaterFall() {
		System.out.println(" no arg const in WaterFall");
	}

	public WaterFall(String name, double heigth, String location) {
		this.name = name;
		this.heigth = heigth;
		this.location = location;
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\nheigth:" + this.heigth + "\nlocation:" + this.location;
	}
	

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in waterfall");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof WaterFall) {
				System.out.println("obj is WaterFall");
				WaterFall casted = (WaterFall) obj;
				WaterFall left = this;
				WaterFall right = casted;
				if (left.name.endsWith(right.name) && left.heigth == right.heigth
						&& left.location.equals(right.location)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not WaterFall");
			}
		} else {
			System.err.println("obj is  null");
		}
		return super.equals(obj);

	}
}
