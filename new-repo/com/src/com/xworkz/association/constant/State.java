package com.xworkz.association.constant;

public class State {
	public String name;
	public String cmname;
	public String language;
	public City city;
	
	public void setinfo(String name,String cmname,String language)
	{
		this.name=name;
		this.cmname=cmname;
		this.language=language;
	}
	public void setCity(City city)
	{
		this.city=city;
	}
	public void display()
	{
		System.out.println("state name is:"+this.name);
		System.out.println("cm name  is:"+this.cmname);
        System.out.println("common language in state is:"+this.language);
        if(city!=null)
        {
        	this.city.display();
        	
        }
        else
        {
        	System.out.println("this.city is pointing to nulls");
        }
        System.out.println("     ");

	}
	

}
