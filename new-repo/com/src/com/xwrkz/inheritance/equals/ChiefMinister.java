package com.xwrkz.inheritance.equals;

public class ChiefMinister {
	private String name;
	private int salary;
	private String state;
	private double heigth;
	private double weight;
	private String color;
	private int noOfCars;
	private int noOfSecurities;
	private String wifeName;
	private int noOfChildrens;
	private int age;
	private int duration;
	private String birthPlace;

	public ChiefMinister() {
		System.out.println("no arg const in chiefminister");
	}

	public ChiefMinister(String name, int salary, String state, double heigth, double weight, String color,
			int noOfCars, int noOfSecurities, String wifeName, int noOfChildrens, int age, int duration,
			String birthPlace) {
		this.name = name;
		this.salary = salary;
		this.state = state;
		this.heigth = heigth;
		this.weight = weight;
		this.color = color;
		this.noOfCars = noOfCars;
		this.noOfSecurities = noOfSecurities;
		this.wifeName = wifeName;
		this.noOfChildrens = noOfChildrens;
		this.age = age;
		this.duration = duration;
		this.birthPlace = birthPlace;
	}

	@Override
	public String toString() {
		return "name:" + this.name + "\nsalary:" + this.salary + "\nstate:" + this.state + "\nheigth:" + this.heigth
				+ "\nweight:" + this.weight + "\ncolor:" + this.color + "\nnoOfCars:" + this.noOfCars
				+ "\nnoOfSecurities:" + this.noOfSecurities + "\nwifeName:" + this.wifeName + "\nnoOfChildrens:"
				+ this.noOfChildrens + "\nage:" + this.age + "\nduration:" + this.duration + "\nbirthPlace:"
				+ this.birthPlace;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in chiefminister");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof ChiefMinister) {
				System.out.println("obj is ChiefMinister");
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister left = this;
				ChiefMinister right = casted;
				if (left.name.equals(right.name) && left.salary == right.salary && left.state.equals(right.state)
						&& left.heigth == right.heigth && left.weight == right.weight && left.color.equals(right.color)
						&& left.noOfCars == right.noOfCars && left.noOfSecurities == right.noOfSecurities
						&& left.wifeName.equals(right.weight) && left.noOfChildrens == right.noOfChildrens
						&& left.age == right.age && left.duration == right.duration
						&& left.birthPlace.equals(right.birthPlace)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not ChiefMinister");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
