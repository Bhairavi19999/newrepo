package com.xworkz.batch.thursday;

public class Burger {
	public String company;
	public int cost;
	public String type;
	public double weight;
	public boolean veg;
	public String bakedin;
	public int rating;
	public String shape;
	public int bakedtime;
	public int manudate;
	public String inventedby;
	public String orderby;
	public String place;
	public int inventedyear;
	public boolean boxed;
	public  Burger(String company,int cost,String type,double weight,boolean veg,String bakedin,int rating,String shape,int bakedtime,int manudate,String inventedby,String orderby,String place,int inventedyear, boolean boxed)
	{
		this.company=company;
		this.cost=cost;
		this.type=type;
		this.weight=weight;
		this.veg=veg;
		this.bakedin=bakedin;
		this.rating=rating;
		this.shape=shape;
		this.bakedtime=bakedtime;
		this.manudate=manudate;
		this.inventedby=inventedby;
		this.orderby=orderby;
		this.place=place;
		this.inventedyear=inventedyear;
		this.boxed=boxed;

	}
		
	
public void display()
{
		System.out.println("company is:"+this.company);
		System.out.println("cost is:"+this.cost);
		System.out.println("type is:"+this.type);
		System.out.println("weight is:"+this.weight);
		System.out.println("veg is:"+this.veg);
		System.out.println("bakedin is:"+this.bakedin);
		System.out.println("rating is:"+this.rating);
		System.out.println("shape is:"+this.shape);
		System.out.println("bakedtime is:"+this.bakedtime);
		System.out.println("manudate is:"+this.manudate);
		System.out.println("inventedby is:"+this.inventedby);
		System.out.println("place is:"+this.place);
		System.out.println("inventedyear is:"+this.inventedyear);
		System.out.println("boxed is:"+this.boxed);
}
}
