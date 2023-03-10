package com.xworkz.java.rules.runn;

import com.xworkz.java.rules.GoldSeller;
import com.xworkz.java.rules.imp.Abharan;
import com.xworkz.java.rules.imp.DevendraSetu;
import com.xworkz.java.rules.imp.Mahalakshmi;
import com.xworkz.java.rules.imp.Malabar;
import com.xworkz.java.rules.usa.Anitha;
import com.xworkz.java.rules.usa.Bhairavi;
import com.xworkz.java.rules.usa.Priyanka;
import com.xworkz.java.rules.usa.Shruthi;

public class GoldRunner {

	public static void main(String[] args) {
		GoldSeller rule = new Abharan();
		Anitha anitha = new Anitha(rule);
		anitha.buyGold();
		System.out.println("   ");
		GoldSeller rule1 = new DevendraSetu();
		Bhairavi bhairavi = new Bhairavi(rule1);
		bhairavi.bangaraKaridhi();
		System.out.println("   ");
		GoldSeller rule2 = new Mahalakshmi();
		Priyanka priyanka = new Priyanka(rule2);
		priyanka.purchaseGold();
		System.out.println("   ");
		GoldSeller rule3 = new Malabar();
		Shruthi shruthi = new Shruthi(rule3);
		shruthi.chinnaTago();

	}

}
