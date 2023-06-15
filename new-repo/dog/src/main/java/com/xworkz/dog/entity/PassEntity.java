package com.xworkz.dog.entity;

import java.util.Objects;

public class PassEntity {
	private int id;
	private String fname;

	private String lname;

	private int age;

	private long mobile;

	private String country;

	private String address;

	@Override
	public String toString() {
		return "PassEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", mobile=" + mobile
				+ ", country=" + country + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, country, fname, id, lname, mobile);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassEntity other = (PassEntity) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(country, other.country)
				&& Objects.equals(fname, other.fname) && id == other.id && Objects.equals(lname, other.lname)
				&& mobile == other.mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
