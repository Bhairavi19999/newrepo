package com.xwrkz.inheritance.equals;

public class Fridge {
	private String brand;
	private int price;
	private double capacity;
	private int length;
	private int noofdoors;
	private double weigth;
	private String type;
	private String color;
	private int warrenty;
	private int rating;
	private int lifeSpan;
	private String belongsTo;

	public Fridge() {
		System.out.println("no arg const in fridge");
	}

	public Fridge(String brand, int price, double capacity, int length, int noofdoors, double weigth, String type,
			String color, int warrenty, int rating, int lifeSpan, String belongsTo) {
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
		this.length = length;
		this.noofdoors = noofdoors;
		this.weigth = weigth;
		this.type = type;
		this.color = color;
		this.warrenty = warrenty;
		this.rating = rating;
		this.lifeSpan = lifeSpan;
		this.belongsTo = belongsTo;
	}

	@Override
	public String toString() {

		return "brand:" + this.brand + "\nprice:" + this.price + "\ncapacity:" + this.capacity + "\nlength:"
				+ this.length + "\nnoofdoors:" + this.noofdoors + "\nweigth:" + this.weigth + "\ntype:" + this.type
				+ "\ncolor:" + this.color + "\nwarrenty:" + this.warrenty + "\nrating:" + this.rating + "\nlifespan:"
				+ this.lifeSpan + "\nbelongsto:" + this.belongsTo;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in fridge");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fridge) {
				System.out.println("obj is fridge");
				Fridge casted = (Fridge) obj;
				Fridge left = this;
				Fridge right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.capacity == right.capacity
						&& left.length == right.length && left.noofdoors == right.noofdoors
						&& left.weigth == right.weigth && left.type.equals(right.type) && left.color.equals(right.color)
						&& left.warrenty == right.warrenty && left.rating == right.rating
						&& left.lifeSpan == right.lifeSpan && left.belongsTo.equals(right.belongsTo)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not fridge");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
