package com.xwrkz.string;

public abstract class Atm {
	public Atm() {
		System.out.println("no arg const");
	}

	abstract void withdraw();

	abstract void deposite();

	abstract void generatepin();

	abstract void ministatment();

	abstract void changepassword();

	abstract void balance();

	abstract void pin();

	abstract void quickcash();

}
