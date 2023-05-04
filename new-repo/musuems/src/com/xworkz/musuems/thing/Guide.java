package com.xworkz.musuems.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Guide {
	@Autowired
	private Security security;

	private void Guide(Security security) {
		this.security = security;
		System.out.println("running security in guide");
	}

	@Override
	public String toString() {
		return "Guide [security=" + security + "]";
	}

}
