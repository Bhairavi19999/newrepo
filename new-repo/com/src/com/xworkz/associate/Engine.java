package com.xworkz.associate;

public class Engine {
	public int cost;
	public String type;
	public double weigth;
	public void inti(int cost,String type,double weigth)
	{
	this.cost=cost;
	this.type=type;
	this.weigth=weigth;
	}
	public void show()
	{
		System.out.println("cost of enegine is:"+cost);
		System.out.println("type of the engine is:"+type);
		System.out.println("weigth of engine is:"+weigth);
	}

}
