package com.xwrkz.boot.monday;

public class RunnerFan {

	public static void main(String[] args) {
Fan Fan=new Fan();
System.out.println("fan  name is:"+Fan.name);
System.out.println("fan  cost is:"+Fan.cost);
System.out.println("fan  brand is:"+Fan.brand);


Fan.name="usha";
Fan.cost=1500;
Fan.brand="USHA";

System.out.println("fan  name is:"+Fan.name);
System.out.println("fan  cost is:"+Fan.cost);
System.out.println("fan  brand is:"+Fan.brand);

	}

}
