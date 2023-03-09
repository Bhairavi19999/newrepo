package com.xworkz.rules;

public class HospitalRules implements Hospital {

	@Override
	public boolean silence() {
		System.out.println("running in Hospitalrules");
		return true;
	}

	@Override
	public boolean clean() {
		System.out.println("running in Hospitalrules");
		return true;
	}

	@Override
	public String mask() {
		System.out.println("running in Hospitalrules");
		return "must";
	}

	@Override
	public String phone() {
		System.out.println("running in Hospitalrules");
		return "slient";
	}

	@Override
	public boolean bekind() {
		System.out.println("running in Hospitalrules");
		return true;
	}

	@Override
	public boolean dontsmoke() {
		System.out.println("running in Hospitalrules");
		return false;
	}

	@Override
	public String dresscode() {
		System.out.println("running in Hospitalrules");
		return "white";
	}

	@Override
	public double timing() {
		System.out.println("running in Hospitalrules");
		return 10.30;
	}

	@Override
	public boolean distance() {
		System.out.println("running in Hospitalrules");
		return true;
	}

	@Override
	public String gloves() {
		System.out.println("running in Hospitalrules");
		return "complasary";
	}

}
