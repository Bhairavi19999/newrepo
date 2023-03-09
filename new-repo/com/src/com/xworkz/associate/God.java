package com.xworkz.associate;

public class God {
	public String name;
	public String flowers;
	public boolean female;
	public void inti(String name,String flowers,boolean female)
	{
		this.name=name;
		this.flowers=flowers;
		this.female=female;
	}
	public void show()
	{
		System.out.println("name of the god  is:"+name);
		System.out.println("name of flower is:"+flowers);
		System.out.println("goddess is:"+female);
	}

}
