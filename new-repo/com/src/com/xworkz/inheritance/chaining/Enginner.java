package com.xworkz.inheritance.chaining;

public class Enginner extends Person {

	public Enginner(int id, String name, int age, String email) {
		super(id, name, age, email);
	}

	public Enginner(int id, String name) {
		super(id, name);
	}

	public Enginner(int id, String name, String email) {
		super(id, name, email);
	}

	@Override
	public String toString() {
		return "id:" + this.id + "\nname:" + this.name + "\nage:" + this.age + "\nemail:" + this.email;
	}

	@Override
	public int hashCode() {
		return 120;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in enginner");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Enginner) {
				System.out.println("obj is Enginner");

				Enginner casted = (Enginner) obj;
				Enginner left = this;
				Enginner right = casted;
				if (left.id == right.id && left.name.equals(right.name) && left.age == right.age
						&& left.email.equals(right.email)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println(" left is not equal is right");
				}
			} else {
				System.out.println("obj is not Enginner");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
