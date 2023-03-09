package com.xwrkz.string;

public class Bank extends Atm {
	@Override
	public void withdraw() {
		System.out.println("running in bank");
	}

	@Override
	public void deposite() {
		System.out.println("deposite in bank");
	}

	@Override
	public void generatepin() {
		System.out.println("generatepin in bank");
	}

	@Override
	public void ministatment() {
		System.out.println("ministatment in bank");
	}

	@Override
	public void balance() {
		System.out.println("balance in bank");
	}

	@Override
	public void pin() {
		System.out.println("pin in bank");
	}

	@Override
	public void changepassword() {
		System.out.println("changepassword in bank");
	}

	@Override
	public void quickcash() {
		System.out.println("quickcash in bank");
	}

}
