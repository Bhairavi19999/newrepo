package com.xworkz.associate;

public class JawaBike 
{
	public int seats;
	public double length;
	public double weigth;
	public Engine engine=new Engine();
	public void inti(int seats,double length,double weigth)
	{
		this.seats=seats;
		this.length=length;
		this.weigth=weigth;
	}
	public void display()
	{
		System.out.println("number of seats is:"+seats);
		System.out.println("length of the bike is:"+length);
		System.out.println("weigth od bike is:"+weigth);
		this.engine.show();
	}

}
