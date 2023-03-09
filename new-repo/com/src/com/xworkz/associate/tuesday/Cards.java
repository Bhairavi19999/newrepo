package com.xworkz.associate.tuesday;

public class Cards {
	public int size;
	public double thickness;
	
	public Cards(int size,double thickness)
	{
		this.size=size;
		this.thickness=thickness;
	}
	public void show()
	{
		System.out.println("size of card is:"+this.size);
		System.out.println("thickness of card is:"+this.thickness);

	}

}
