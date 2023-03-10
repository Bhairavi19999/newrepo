package com.xworkz.java.rules.runn;

import com.xworkz.java.rules.Delivery;
import com.xworkz.java.rules.imp.Dunzo;
import com.xworkz.java.rules.imp.Rapido;
import com.xworkz.java.rules.usa.Person;

public class DeliveryRunner {

	public static void main(String[] args) {
		Delivery delivery = new Dunzo();
		Person person = new Person(delivery);
		person.checkdelivery();
		System.out.println("    ");
		Delivery delivery1 = new Rapido();
		Person person1 = new Person(delivery1);
		person1.checkdelivery();
	}

}
