package com.xwrkz.inheritance.equals;

public class Fish {
	private String name;
	private int weigth;
	private int price;
	private String purpose;
	private int size;

	public Fish() {
		System.out.println("no arg const in fish");
	}

	public Fish(String name, int weigth, int price, String purpose, int size) {
		this.name = name;
		this.weigth = weigth;
		this.price = price;
		this.purpose = purpose;
		this.size = size;
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\nweigth:" + this.weigth + "\nprice:" + this.price + "\npurpose:" + this.purpose
				+ "\nsize:" + this.size;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in fish");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fish) {
				System.out.println("obj is fish");
				Fish casted = (Fish) obj;
				Fish left = this;
				Fish right = casted;
				if (left.name.equals(right.name) && left.weigth == right.weigth && left.price == right.price
						&& left.purpose.equals(right.purpose) && left.size == right.size) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not a fish");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
