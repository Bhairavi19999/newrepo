package com.xworkz.rules.boot;

import com.xworkz.rules.Hospital;
import com.xworkz.rules.HospitalRules;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalRules Hospital = new HospitalRules();
		System.out.println(Hospital.silence());
		System.out.println(Hospital.clean());
		System.out.println(Hospital.mask());
		System.out.println(Hospital.phone());
		System.out.println(Hospital.bekind());
		System.out.println(Hospital.dontsmoke());
		System.out.println(Hospital.dresscode());
		System.out.println(Hospital.timing());
		System.out.println(Hospital.distance());
		System.out.println(Hospital.gloves());
		System.out.println("   ");
		Hospital Hospital1 = new HospitalRules();
		System.out.println(Hospital1.silence());
		System.out.println(Hospital1.clean());
		System.out.println(Hospital1.mask());
		System.out.println(Hospital1.phone());
		System.out.println(Hospital1.bekind());
		System.out.println(Hospital1.dontsmoke());
		System.out.println(Hospital1.dresscode());
		System.out.println(Hospital1.timing());
		System.out.println(Hospital1.distance());
		System.out.println(Hospital1.gloves());

	}

}
