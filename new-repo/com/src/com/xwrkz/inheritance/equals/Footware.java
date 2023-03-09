package com.xwrkz.inheritance.equals;

public class Footware {
	private String brand;
	private double size;
	private String type;

	public Footware() {
		System.out.println("no arg const in footware");
	}

	public Footware(String brand, double size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	@Override
	public String toString() {
		return "brand:" + this.brand + "\nsize:" + this.size + "\ntype:" + this.type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in footware ");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Footware) {
				System.out.println("obj is footware");
				Footware casted = (Footware) obj;
				Footware left = this;
				Footware right = casted;
				if (left.brand.equals(right.brand) && left.size == right.size && left.type.equals(right.type)) {
					System.out.println("left is  equal right");

					return true;
				} else {
					System.out.println("left is not equal to right");
				}
			} else {
				System.out.println("obj is not footware");
			}
		} else {
			System.out.println("obj is null");
		}

		return super.equals(obj);
	}

}
