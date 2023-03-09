package com.xworkz.inheritance.object;

public class Door {
	private String material;
	private double length;
	private double thickness;
	private double weigth;
	public Door()
	{
		System.out.println(" no arg const in door");
	}
	@Override
	public String toString() 
	{
		return( "material:"+material  + "\nlength:"+length+ "\nthickness:"+thickness + "\nweigth:"+weigth);
	}
	@Override
	public int hashCode()
	{
		return 100;
	}
	public void setMaterial(String material) 
	{
		this.material = material;
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
	public String getMaterial()
	{
		return material;
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
