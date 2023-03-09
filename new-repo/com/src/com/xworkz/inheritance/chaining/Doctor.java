package com.xworkz.inheritance.chaining;

public class Doctor extends Person {
	public String specialist;
	public String hospitalName;

	public Doctor(String specialist, String hospitalName, int id, String name, int age, String email) {
		super(id, name, age, email);
		this.specialist = specialist;
		this.hospitalName = hospitalName;
		System.out.println("running in doctor");

	}

	@Override
	public String toString() {
		return "id:" + this.id + "\nname:" + this.name + "\nage:" + this.age + "\nemail:" + this.email + "\nspecialist:"
				+ this.specialist + "\nhospitalName:" + this.hospitalName;
	}

	@Override
	public int hashCode() {
		return 800;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in Doctor");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Doctor) {
				System.out.println("obj is Doctor");

				Doctor casted = (Doctor) obj;
				Doctor left = this;
				Doctor right = casted;
				if (left.id == right.id && left.name.equals(right.name) && left.age == right.age
						&& left.email.equals(right.email) && left.specialist.equals(right.specialist)
						&& left.hospitalName.equals(right.hospitalName)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println(" left is not equal is right");
				}
			} else {
				System.out.println("obj is not Doctor");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}

}
