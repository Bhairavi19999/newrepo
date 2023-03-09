package com.xworkz.associate;

public class Temple {
	public int length;
	public int rooms;
	public boolean bench;
	public God god=new God();
	public void inti( int length, int rooms,boolean bench)
	{
		this.length=length;
		this.rooms=rooms;
		this.bench=bench;
		
	}
	public void display()
	{
		System.out.println("length of the temple is:"+length);
		System.out.println("number of the rooms in the temple is:"+rooms);
		System.out.println("avalible of bench is:"+bench);
		this.god.show();
	}

}
