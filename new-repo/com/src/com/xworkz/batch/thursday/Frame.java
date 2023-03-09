package com.xworkz.batch.thursday;

public class Frame {
public String type;
public int cost;
public int length;
public double weight;
public boolean wrap;
public String event;
public String material;
public  boolean completed;
public  String place;
public  String orderedby;
public   int date;
public   int noofphotos;

public Frame(String type,int cost,int length,double weight,boolean wrap,String event,String material,boolean completed,String place,String orderedby, int date,int noofphotos)
{
	this.type=type;
this.cost=cost;
this.length=length;
this.weight=weight;
this.wrap=wrap;
this.event=event;
this.material=material;
this.completed=completed;
this.place=place;
this.orderedby=orderedby;
this.date=date;
this.noofphotos=noofphotos;
}
public void display()
{
	System.out.println("type is:"+this.type);
	System.out.println("cost is:"+this.cost);
    System.out.println("length is:"+this.length);
    System.out.println("weight is:"+this.weight);
	System.out.println("wrap is:"+this.wrap);
	System.out.println("event is:"+this.event);
	System.out.println("material is:"+this.material);
	System.out.println("completed is:"+this.completed);
	System.out.println("place is:"+this.place);
	System.out.println("orderedby is:"+this.orderedby);
	System.out.println("date is:"+this.date);
	System.out.println("noofphotos is:"+this.noofphotos);

}
}
