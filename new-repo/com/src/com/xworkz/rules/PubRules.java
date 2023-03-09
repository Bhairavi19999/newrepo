package com.xworkz.rules;

public class PubRules implements Pub {

	@Override
	public boolean bePatient() {
		System.out.println("running in pubrules");
		return true;
	}

	@Override
	public int timing() {
		System.out.println("running in pubrules");
		return 6;
	}

	@Override
	public boolean tips() {
		System.out.println("running in pubrules");
		return false;
	}

	@Override
	public String dresscode() {
		System.out.println("running in pubrules");
		return "modern";
	}

	@Override
	public boolean ragging() {
		System.out.println("running in pubrules");
		return false;
	}

}
