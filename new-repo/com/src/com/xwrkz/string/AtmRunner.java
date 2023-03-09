package com.xwrkz.string;

public class AtmRunner {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.withdraw();
		System.out.println("   ");
		bank.balance();
		System.out.println("   ");
		bank.changepassword();
		System.out.println("   ");
		bank.deposite();
		System.out.println("   ");
		bank.ministatment();
		System.out.println("   ");
		bank.pin();
		System.out.println("   ");
		bank.generatepin();
		System.out.println("   ");
		bank.quickcash();
		System.out.println("   ");

		Projectsub Projectsub = new Projectsub();
		Projectsub.cost();
		System.out.println("   ");
		Projectsub.location();
		System.out.println("   ");
		Projectsub.name();

	}

}
