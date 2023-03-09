package com.xworkz.associate.wednesday;

public class Scientist {
	public String name;
	public String disgnation;
	
	public Scientist()
	{
		System.out.println("no-arg const...");
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setDisgnation(String disgnation)
	{
		this.disgnation=disgnation;
	}
	
	public void show()
	{
		System.out.println("name is:"+this.name);
		System.out.println("disgnation is :"+this.disgnation);
	}

}
