package com.xworkz.chain;

public class Place {
	public String placename;
	public int population;
	public  String state;
	public String country;
	public String district;
	public Place()
	{
		System.out.println("constructing without arguments");
	}
	public Place (String placename)
	{
		this.placename=placename;
		System.out.println("placename");

		
	}
	public Place (String placename,int population)
	{
		this(placename);
		this.population=population;
		System.out.println("constructing without arguments");

		}
	public Place (String placename,int population,String state)
	{
		this(placename,population);
		this.state=state;
		System.out.println("constructing without arguments");

		}
	public Place (String placename,int population,String state,String country)
	{
		this(placename,population,state);
		this.country=country;
		System.out.println("constructing without arguments");

		}
	public Place (String placename,int population,String state,String country,String district)
	{
		this(placename,population,state,country);
		this.district=district;
		System.out.println("constructing without arguments");

		}
	public void inti(String placename,int population,String state,String country,String district)
	{

		this.placename=placename;
		this.population=population;
		this.state=state;
		this.country=country;
		this.district=district;
}
public void show()
{
	System.out.println("ABOUT TUMKUR");
	System.out.println("placename is:"+placename);
	System.out.println("population is:"+population);
    System.out.println("state is:"+state);
	System.out.println("country is:"+country);
	System.out.println("district is:"+district);
}
}