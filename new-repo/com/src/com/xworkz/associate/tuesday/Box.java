package com.xworkz.associate.tuesday;

public class Box {
	public int length;
	public double weight;
	
	
	public Box(int length,double weight)
	{
		this.length=length;
		this.weight=weight;
	}
	public void show()
	{
		System.out.println("length of box is:"+this.length);
		System.out.println("weight of box is:"+this.weight);

	}
	

}
