package com.xworkz.associate.tuesday;

public class SunGlass {
public int cost;
public String shape;
public Glass glass;
public SunGlass()
{
	System.out.println("no argu const");
}
public SunGlass(int cost,String shape)
{
	this.cost=cost;
	this.shape=shape;
}
public void init(Glass glass)
{
	this.glass=glass;
}
public void display()
{
	System.out.println("cost of sunglass is:"+this.cost);
	System.out.println("shape of sunglass is:"+this.shape);
	if(glass!=null) {
		this.glass.show();
	}
	else
	{
		System.err.println("glass is not pointing to any address");
	}
}
}
