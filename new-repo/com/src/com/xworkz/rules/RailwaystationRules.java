package com.xworkz.rules;

public class RailwaystationRules implements Railwaystation {

	@Override
	public boolean carringExplosiveThings() {
		System.out.println("running in Railwaystation");
		return false;
	}

	@Override
	public String tickets() {
		System.out.println("running in Railwaystation");
		return "complesary";
	}

	@Override
	public boolean bekind() {
		System.out.println("running in Railwaystation");
		return true;
	}

	@Override
	public boolean pullingChain() {
		System.out.println("running in Railwaystation");
		return false;
	}

	@Override
	public boolean clean() {
		System.out.println("running in Railwaystation");
		return true;
	}

	@Override
	public boolean useageOfToilits() {
		System.out.println("running in Railwaystation");
		return true;
	}

	@Override
	public boolean respect() {
		System.out.println("running in Railwaystation");
		return true;
	}

	@Override
	public boolean safty() {
		System.out.println("running in Railwaystation");
		return false;
	}

}
