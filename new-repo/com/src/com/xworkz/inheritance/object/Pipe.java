package com.xworkz.inheritance.object;

public class Pipe {
	private String brand;
	private double length;
	private double thickness;
	private double weigth;
	public Pipe()
	{
		System.out.println("no arg const in pipe");
	}
	@Override
	public String toString() {
		return( "brand:"+brand  + "\nlength:"+length+ "\nthickness:"+thickness + "\nweigth:"+weigth);

	}
	@Override
	public int hashCode() 
	{
		return 500;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setThickness(double thickness) 
	{
		this.thickness = thickness;
	}
	public void setWeigth(double weigth)
	{
		this.weigth = weigth;
	}
	public String getBrand()
	{
		return brand;
	}
	public double getLength()
	{
		return length;
	}
	public double getThickness()
	{
		return thickness;
	}
	public double getWeigth()
{
		return weigth;
	}

}
