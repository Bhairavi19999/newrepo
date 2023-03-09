package com.xworkz.rules;

public class FamilyRules implements Family {

	@Override
	public String dressing() {
		System.out.println("running in FamilyRules ");
		return "tradition";
	}

	@Override
	public boolean hurting() {
		System.out.println("running in FamilyRules ");
		return false;
	}

	@Override
	public boolean interrupting() {
		System.out.println("running in FamilyRules ");
		return false;
	}

	@Override
	public String treatingPeople() {
		System.out.println("running in FamilyRules ");
		return "softly";
	}

	@Override
	public boolean tellTheTruth() {
		System.out.println("running in FamilyRules ");
		return false;
	}

	@Override
	public int exceriseTiming() {
		System.out.println("running in FamilyRules ");
		return 2;
	}

	@Override
	public boolean attendingFunction() {
		System.out.println("running in FamilyRules ");
		return false;
	}

	@Override
	public boolean closedDoors() {
		System.out.println("running in FamilyRules ");
		return false;
	}

	@Override
	public boolean respect() {
		System.out.println("running in FamilyRules ");
		return true;
	}

	@Override
	public boolean safety() {
		System.out.println("running in FamilyRules ");
		return true;
	}

	@Override
	public boolean beclean() {
		System.out.println("running in FamilyRules ");
		return true;
	}

	@Override
	public boolean dontshout() {
		System.out.println("running in FamilyRules ");
		return true;
	}

	@Override
	public boolean playing() {
		System.out.println("running in FamilyRules ");
		return false;
	}

	@Override
	public boolean kindwords() {
		System.out.println("running in FamilyRules ");
		return true;
	}

	@Override
	public boolean takePermission() {
		System.out.println("running in FamilyRules ");
		return true;
	}

}
