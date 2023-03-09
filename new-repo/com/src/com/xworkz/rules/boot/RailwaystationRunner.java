package com.xworkz.rules.boot;

import com.xworkz.rules.Railwaystation;
import com.xworkz.rules.RailwaystationRules;

public class RailwaystationRunner {

	public static void main(String[] args) {
		RailwaystationRules Railwaystation = new RailwaystationRules();
		System.out.println(Railwaystation.carringExplosiveThings());
		System.out.println(Railwaystation.tickets());
		System.out.println(Railwaystation.bekind());
		System.out.println(Railwaystation.pullingChain());
		System.out.println(Railwaystation.clean());
		System.out.println(Railwaystation.useageOfToilits());
		System.out.println(Railwaystation.respect());
		System.out.println(Railwaystation.safty());
		System.out.println("   ");
		Railwaystation Railwaystation1 = new RailwaystationRules();
		System.out.println(Railwaystation1.carringExplosiveThings());
		System.out.println(Railwaystation1.tickets());
		System.out.println(Railwaystation1.bekind());
		System.out.println(Railwaystation1.pullingChain());
		System.out.println(Railwaystation1.clean());
		System.out.println(Railwaystation1.useageOfToilits());
		System.out.println(Railwaystation1.respect());
		System.out.println(Railwaystation1.safty());

	}

}
