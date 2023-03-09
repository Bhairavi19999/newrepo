package com.xworkz.associate.tuesday;

public class Sweater {
	public String type;
	public int cost;
	public Zip zip;
	public Sweater()
	{
		System.out.println("no argu const");
	}
	public Sweater(String type,int cost)
	{
		this.type=type;
		this.cost=cost;
	}
public void display()
{
	System.out.println("type of sweater is:"+this.type);
	System.out.println("cost of sweater is:"+this.cost);
	if(zip!=null)
	{
		this.zip.show();
	}
	else
	{
		System.err.println("zip is not pointing to any address");
	}
}
}
