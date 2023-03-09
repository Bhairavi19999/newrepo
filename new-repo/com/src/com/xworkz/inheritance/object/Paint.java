package com.xworkz.inheritance.object;


public class Paint {
	private int noofcolors;
	private String type;
	private String paintersname;
	private double price;
	public Paint()
	{
		System.out.println("no arg cons in paint");
	}
	@Override
	public String toString() 
	{
		System.out.println("to string in paint");
		return( "noofcolors:"+noofcolors  + "\ntype:"+type+ "\npaintersname:"+paintersname + "\nprice:"+price);
	}
	@Override
	public int hashCode() {
		return 345;
	}
public void setNoofcolors(int noofcolors)
{
 this.noofcolors=noofcolors;
}
public void setType(String type)
{
	 this.type=type;
}
public void setPaintersName(String paintersname)
{
	this.paintersname=paintersname;
}
public void setPrice(double price)
{
	this.price=price;
}

public int getNoofcolors() 
{
	return noofcolors;
}
public String getType()
{
	return type;
}
public String getPaintersname() {
	return paintersname;
}
public double getPrice()
{
	return price;
}

}

