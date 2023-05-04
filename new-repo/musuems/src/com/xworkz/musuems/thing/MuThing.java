package com.xworkz.musuems.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component

public class MuThing {
	@Autowired
	private String groupName;
	@Autowired
	private int totalNo;
	@Autowired
	private int numberOfBenches;
	@Autowired
	private int numberOfcells;
	@Autowired
	private double price;

	@Override
	public String toString() {
		return "MuThing [groupName=" + groupName + ", totalNo=" + totalNo + ", numberOfBenches=" + numberOfBenches
				+ ", numberOfcells=" + numberOfcells + ", price=" + price + "]";
	}

}
