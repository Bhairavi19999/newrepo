package com.xworkz.musuems.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Security {
@Autowired
	private MuThing muThing;

	public Security(MuThing muThing) {
		this.muThing = muThing;
		System.out.println("running muthing in security");

	}

	@Override
	public String toString() {
		return "Security [muThing=" + muThing + "]";
	}

}
