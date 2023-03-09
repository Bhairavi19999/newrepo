package com.xwrkz.inheritance.equals;

public class Park {
	private String name;
	private String location;
	private int sqkms;
	private int noofwrkers;
	private int benches;
	private String game;

	public Park() {
		System.out.println("no arg const in Park");
	}

	public Park(String name, String location, int sqkms, int noofwrkers, int benches, String game) {
		this.name = name;
		this.location = location;
		this.sqkms = sqkms;
		this.noofwrkers = noofwrkers;
		this.benches = benches;
		this.game = game;
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\nlocation:" + this.location + "\nsqkms:" + this.sqkms + "\nnoofworkers:"
				+ this.noofwrkers + "\nbenches:" + this.benches + "\ngame:" + this.game;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in park");

		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Park) {
				System.out.println("obj is park");
				Park casted = (Park) obj;
				Park left = this;
				Park right = casted;
				if (left.name.equals(right.name) && left.location.equals(right.location) && left.sqkms == right.sqkms
						&& left.noofwrkers == right.noofwrkers && left.benches == right.benches
						&& left.game.equals(right.game)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not park");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
