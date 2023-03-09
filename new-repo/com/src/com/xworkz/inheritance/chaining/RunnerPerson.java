package com.xworkz.inheritance.chaining;

public class RunnerPerson {

	public static void main(String[] args) {
		Enginner enginner = new Enginner(12, "AAA", 22, "aaa@gmail.com");
		System.out.println(enginner);
		boolean equal = enginner.equals(enginner);
		System.out.println(equal);
		System.out.println("hashcode is:" + enginner.hashCode());

		System.out.println("    ");

		Enginner enginner1 = new Enginner(15, "DDD", 22, "ddd@gmail.com");
		System.out.println(enginner1);
		boolean equal3 = enginner.equals(enginner1);
		System.out.println(equal3);
		System.out.println("hashcode is:" + enginner.hashCode());

		System.out.println("    ");

		Enginner enginner2 = new Enginner(15, "DDD", 22, "ddd@gmail.com");
		System.out.println(enginner2);
		boolean equal4 = enginner1.equals(enginner2);
		System.out.println(equal4);
		System.out.println("hashcode is:" + enginner.hashCode());

		System.out.println("    ");

		Doctor doctor = new Doctor("kedney", "government hospital", 22, "AAA", 22, "aaa@gmail.com");
		System.out.println(doctor);
		boolean equal2 = doctor.equals(doctor);
		System.out.println(equal2);
		System.out.println("hashcode is:" + doctor.hashCode());

		System.out.println("   ");

		Doctor doctor1 = new Doctor("kedney", "every hospital", 22, "AAA", 22, "aaa@gmail.com");
		System.out.println(doctor1);
		boolean equal5 = doctor.equals(doctor1);
		System.out.println(equal5);
		System.out.println("hashcode is:" + doctor.hashCode());

	}

}
