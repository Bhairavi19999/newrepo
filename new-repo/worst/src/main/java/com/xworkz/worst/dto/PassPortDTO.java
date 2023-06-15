package com.xworkz.worst.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class PassPortDTO implements Serializable, Comparable<PassPortDTO> {
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 20, message = " must contain 3 or more char")

	private String fname;
	@Size(min = 3, max = 20, message = " must contain 3 or more char")

	private String lname;
	@Min(value = 10)

	private int age;

	@Min(value = 1)

	private long mobile;

	private String country;

	@Size(min = 3, max = 20, message = " must contain 3 or more char")

	private String address;

	@Override
	public String toString() {
		return "PassPortDTO [fname=" + fname + ", lname=" + lname + ", age=" + age + ", mobile=" + mobile + ", country="
				+ country + ", address=" + address + "]";
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

	@Override
	public int hashCode() {
		return Objects.hash(address, age, country, fname, lname, mobile);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassPortDTO other = (PassPortDTO) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(country, other.country)
				&& Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname) && mobile == other.mobile;
	}

	@Override
	public int compareTo(PassPortDTO o) {
		return this.getFname().compareTo(o.getFname());
	}

}
