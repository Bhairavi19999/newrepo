package com.xworkz.associate;

public class Trainer {
	public String name;
	public double salary;
	public boolean present;
	public void inti( String name,double salary,boolean present)
	{
		this.name=name;
		this.salary=salary;
		this.present=present;
	}
	public void show()
	{
System.out.println("name of Trainer is:"+name);
System.out.println("salary of trainer is:"+salary);
System.out.println("xwrkz has a trainer :"+present);
	}
}



