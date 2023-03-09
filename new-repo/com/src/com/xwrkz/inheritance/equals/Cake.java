package com.xwrkz.inheritance.equals;

public class Cake {
	private String flavour;
	private double weight;
	private String shape;
	private int price;

	public Cake() {
		System.out.println("no arg const in cake");
	}

	public Cake(String flavour, double weight, String shape, int price) {
		this.flavour = flavour;
		this.price = price;
		this.shape = shape;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "flavour:" + this.flavour + "\nweight:" + this.weight + "\nshape:" + this.shape + "\nprice:"
				+ this.price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in cake");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Cake) {
				System.out.println("obj is cake");
				Cake casted = (Cake) obj;
				Cake left = this;
				Cake right = casted;
				if (left.flavour.equals(right.flavour) && left.weight == right.weight && left.shape.equals(right.shape)
						&& left.price == right.price) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not cake");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
