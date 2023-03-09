package com.xworkz.override;

public class Clock {
	public Clock() {
		System.out.println("no arg const in Clock");
	}

	public int showdate() {
		return 22;
	}

	public void showday() {
		System.out.println("showday running in clock");
	}
}
