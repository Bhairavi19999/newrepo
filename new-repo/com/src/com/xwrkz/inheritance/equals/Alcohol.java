package com.xwrkz.inheritance.equals;

public class Alcohol {
	private String brand;
	private int percentage;
	private int price;
	private String type;

	public Alcohol() {
		System.out.println(" no arg const in Alcohol");
	}

	public Alcohol(String brand, int percentage, int price, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "brand:" + this.brand + "\npercentage:" + this.percentage + "\nprice:" + this.price + "\ntype:"
				+ this.type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in alchol");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Alcohol) {
				System.out.println("obj is alcohol");
				Alcohol casted = (Alcohol) obj;
				Alcohol left = this;
				Alcohol right = casted;
				if (left.brand.equals(right.brand) && left.percentage == right.percentage && left.price == right.price
						&& left.type.equals(right.type)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not alcohol");
			}
		} else {
			System.err.println("obj is null");
		}

		return super.equals(obj);
	}

}
