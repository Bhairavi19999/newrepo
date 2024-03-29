package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {

	private String name;
	@Value("3")
	private int experience;
	@Value("3000")

	private int salary;
	@Value("30")

	private int age;
	@Value("9988776655")

	private long contactno;
	@Value("male")
	private String gender;

	public Barber(@Value("ram") String name) {
		this.name = name;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", experience=" + experience + ", salary=" + salary + ", age=" + age
				+ ", contactno=" + contactno + ", gender=" + gender + "]";
	}

}
