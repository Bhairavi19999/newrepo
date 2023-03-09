package com.xworkz.associate.tuesday;

public class Glass {
	public int cost;
	public int thickness;
	public Glass(int cost,int thickness)
	{
		this.cost=cost;
		this.thickness=thickness;
	}
	public void show()
	{
		System.out.println("cost of glass is:"+this.cost);
		System.out.println("thickness of glass is:"+this.thickness);

	}

}
