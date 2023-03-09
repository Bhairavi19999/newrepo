package com.xworkz.rules.boot;

import com.xworkz.rules.Pub;
import com.xworkz.rules.PubRules;

public class PubRunner {

	public static void main(String[] args) {
		PubRules Pub = new PubRules();
		System.out.println(Pub.bePatient());
		System.out.println(Pub.dresscode());
		System.out.println(Pub.ragging());
		System.out.println(Pub.timing());
		System.out.println(Pub.tips());
		System.out.println("    ");

		Pub Pub1 = new PubRules();
		System.out.println(Pub1.bePatient());
		System.out.println(Pub1.dresscode());
		System.out.println(Pub1.ragging());
		System.out.println(Pub1.timing());
		System.out.println(Pub1.tips());

	}

}
