package com.xworkz.inheritance.object;

public class Sugarcane {
	private double length;
	private String shape;
	private String ownername;
	private String buyersname;
	public Sugarcane()
	{
		System.out.println("no arg const in sugarcane");
	}
	@Override
	public String toString()
	{
		return( "length:"+length  + "\nshape:"+shape+ "\nownername:"+ownername + "\nbuyersname:"+buyersname);
	}
	@Override
	public int hashCode()
	{
		return 700;
	}
	public void setBuyersname(String buyersname)
	{
		this.buyersname = buyersname;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setOwnername(String ownername) 
	{
		this.ownername = ownername;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	public String getBuyersname()
	{
		return buyersname;
	}
	public double getLength()
	{
		return length;
	}
	public String getShape()
	{
		return shape;
	}
	public String getOwnername() 
	{
		return ownername;
	}

}
