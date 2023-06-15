package com.xworkz.dog.dto;

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
public class PassportDTO implements Serializable, Comparable<PassportDTO> {
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 20, message = " must contain 3 or more char")

	private String fname;
	@Size(min = 3, max = 20, message = " must contain 3 or more char")

	private String lname;
	@Min(value = 10)

	private int age;

	@Min(value = 9)

	private long mobile;

	private String country;

	@Size(min = 3, max = 20, message = " must contain 3 or more char")
	private String originalFileName;
	private String address;
	private String fileName;
	private String contentType;

	@Override
	public int compareTo(PassportDTO o) {
		// TODO Auto-generated method stub
		return 0;
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

	public String getOriginalFileName() {
		return originalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Override
	public String toString() {
		return "PassportDTO [fname=" + fname + ", lname=" + lname + ", age=" + age + ", mobile=" + mobile + ", country="
				+ country + ", originalFileName=" + originalFileName + ", address=" + address + ", fileName=" + fileName
				+ ", contentType=" + contentType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contentType, country, fileName, fname, lname, mobile, originalFileName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassportDTO other = (PassportDTO) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contentType, other.contentType) && Objects.equals(country, other.country)
				&& Objects.equals(fileName, other.fileName) && Objects.equals(fname, other.fname)
				&& Objects.equals(lname, other.lname) && mobile == other.mobile
				&& Objects.equals(originalFileName, other.originalFileName);
	}

}
