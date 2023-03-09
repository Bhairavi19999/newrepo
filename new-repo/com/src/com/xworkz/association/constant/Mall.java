package com.xworkz.association.constant;

public class Mall {
	public String name;
	public boolean ambience;
	public int noOfFloors;
	public Security security;
	
	
	
	public void setinfo(String name,boolean ambience,int noOfFloors)
	{
		this.name=name;
		this.ambience=ambience;
		this.noOfFloors=noOfFloors;
	}
	
	public void setSecurity(Security security)
	{
		this.security=security;
	}
	
	public void display()
	{
		System.out.println("Mall name is:"+this.name);
		System.out.println("about ambience :"+this.ambience);
		System.out.println("  number of floors in mall is:"+this.noOfFloors);
		if(security!=null)
		{
			this.security.display();
		}
		else
		{
			System.out.println("this.security is pointing to null");
		}
		System.out.println("     ");
		
	}

}
