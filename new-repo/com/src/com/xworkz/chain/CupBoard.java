package com.xworkz.chain;

public class CupBoard {
	public String material;
	public int cost;
	public  int size;
	public double length;
	public  int capacity;
	public String shopname;
	
	
	public CupBoard()
	{
		System.out.println("CUPBOARD");
	}
	public CupBoard(String material)
	{
		this.material=material;
		System.out.println("CUPBOARD");
	}
	public CupBoard(String material,int cost)
	{
		this(material);
		this.cost=cost;
		System.out.println("CUPBOARD");
	}
	public CupBoard(String material,int cost, int size)
	{
		this(material,cost);
		this.size=size;
		System.out.println("CUPBOARD");
	}
	public CupBoard(String material,int cost, int size,double length)
	{
		this(material,cost,size);
		this.length=length;
		System.out.println("CUPBOARD");
	}
	public CupBoard(String material,int cost, int size,double length, int capacity)
	{
		this(material,cost,size,length);
		this.capacity=capacity;
		System.out.println("CUPBOARD");
	}
	public CupBoard(String material,int cost, int size,double length, int capacity,String shopname)
	{
		this(material,cost,size,length,capacity);
		this.shopname=shopname;
		System.out.println("CUPBOARD");
	}
	public void inti(String material,int cost, int size,double length, int capacity,String shopname)
	{
		this.material=material;
		this.cost=cost;
		this.size=size;
		this.length=length;
		this.capacity=capacity;
		this.shopname=shopname;
	}

public void show()
{
	System.out.println(" ABOUT  CUPBOARD");
	System.out.println("material is:"+material);
	System.out.println("cost is:"+cost);
	System.out.println("size is:"+size);
	System.out.println("length is:"+length);
	System.out.println("capacity is:"+capacity);
	System.out.println("shopname is:"+shopname);
}
}