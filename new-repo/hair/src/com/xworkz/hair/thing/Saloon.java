package com.xworkz.hair.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	private String name;
	@Value("raj")
	private String ownername;
	@Value("mens")
	private String type;
	@Value("tumkur")
	private String location;
	@Value("2")
	private int noOfBarbers;

	public Saloon(@Value("ravi") String name) {
		this.name = name;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setNoOfBarbers(int noOfBarbers) {
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownername=" + ownername + ", type=" + type + ", location=" + location
				+ ", noOfBarbers=" + noOfBarbers + "]";
	}

}
