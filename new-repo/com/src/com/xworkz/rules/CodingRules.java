package com.xworkz.rules;

public class CodingRules implements Coding {

	@Override
	public String className() {
		System.out.println("running in codingrules");
		return "uppercase";
	}

	@Override
	public String variableName() {
		System.out.println("running in codingrules");
		return "lowercase";
	}

	@Override
	public boolean underscore() {
		System.out.println("running in codingrules");
		return false;
	}

	@Override
	public String packages() {
		System.out.println("running in codingrules");
		return "lowercase";
	}

	@Override
	public int linesOfCode() {
		System.out.println("running in codingrules");
		return 100;
	}

	@Override
	public boolean defaultPackage() {
		System.out.println("running in codingrules");
		return false;
	}

	@Override
	public boolean publicClass() {
		System.out.println("running in codingrules");
		return true;
	}

	@Override
	public boolean methodDescription() {
		System.out.println("running in codingrules");
		return true;
	}

	@Override
	public boolean semicolon() {
		System.out.println("running in codingrules");
		return true;
	}

	@Override
	public boolean SOP() {
		System.out.println("running in codingrules");
		return true;
	}

}
