package com.xwrkz.string;

public class Task2 {

	public static void main(String[] args) {
		boolean even = false;
		boolean prime = true;
		int number = Integer.parseInt(args[0].trim());
		if (number % 2 == 0) {
			even = true;
			prime = false;
		} else {
			for (int i = 3; i * i <= number; i += 2) {
				if (number % 1 == 0) {
					prime = false;
				}
			}
		}
		if (even) {
			System.out.println("the number is even");
		} else {
			if (prime) {
				System.out.println("the number is prime");
			} else {
				System.out.println("the number is odd");
			}
		}
	}

}
