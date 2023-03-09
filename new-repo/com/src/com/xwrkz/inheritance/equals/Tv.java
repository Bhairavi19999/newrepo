package com.xwrkz.inheritance.equals;

public class Tv {
	private String brand;
	private double price;
	private double size;

	public Tv() {
		System.out.println("no arg const in tv");
	}

	public Tv(String brand, double price, double size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "brand :" + this.brand + "\nprice :" + this.price + "\nsize :" + this.size;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running object in tv");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Tv) {
				System.out.println("obj is tv");
				Tv casted = (Tv) obj;
				Tv left = this;
				Tv right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.size == right.size) {
					System.out.println("left is  equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not tv");
			}
		} else {
			System.err.println("obj is null");
		}

		return super.equals(obj);
	}

}
