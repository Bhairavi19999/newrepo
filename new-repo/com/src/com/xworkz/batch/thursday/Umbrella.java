package com.xworkz.batch.thursday;

public class Umbrella {
	public String brand;
	public  String type;
	public int cost;
	public int length;
	public double weight;
	public  boolean doubleflod;
	public  int manuyear;
	public  String company;
	public  String usedto;
	public String usedby;
	
	
	public Umbrella(String brand,String type,int cost, int length,double weight,boolean doubleflod,int manuyear,String company,String usedto,String usedby)
	{
		this.brand=brand;
		this.type=type;
		this.cost=cost;
		this.length=length;
		this.weight=weight;
		this.doubleflod=doubleflod;
		this.manuyear=manuyear;
		this.company=company;
		this.usedto=usedto;
		this.usedby=usedby;
}
	public void display()
	{
		System.out.println("brand is:"+this.brand);
		System.out.println("type is:"+this.type);
		System.out.println("cost is:"+this.cost);
		System.out.println("length is:"+this.length);
		System.out.println("weight is:"+this.weight);
		System.out.println("doubleflod is:"+this.doubleflod);
		System.out.println("manuyear is:"+this.manuyear);
		System.out.println("company is:"+this.company);
		System.out.println("usedto is:"+this.usedto);
        System.out.println("usedby is:"+this.usedby);

	}

}
