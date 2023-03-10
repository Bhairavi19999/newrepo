package com.xworkz.java.rules.usa;

import com.xworkz.java.rules.Delivery;

public class Person {
	public Delivery delivery;

	public Person(Delivery delivery) {
		this.delivery = delivery;
	}

	public void checkdelivery() {
		double charge = this.delivery.charges();
		double time = this.delivery.timeTaken();
		String name = this.delivery.agentName(3);
		System.out.println("agent name is:" + name);
		if (charge < 60) {
			System.out.println("charges are ok");
		} else {
			System.out.println("charges are expensive");
		}
		if (time <= 30) {
			System.out.println("ontime delivery");
		} else {
			System.out.println("delayed delivery");
		}
	}

}
