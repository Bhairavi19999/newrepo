package com.xworkz.association.constant;

public class Area {
	public String name;
	public int population;
	public int street;
	
	
	public Area(String name, int population,int street)
	{
	this.name=name;
	this.population=population;
	this.street=street;
	}
	public void show()
	{
		System.out.println("area name is:"+this.name);
		System.out.println("population in area  is:"+this.population);
		System.out.println("street number in area  is:"+this.street);
System.out.println("     ");

	}

}
