package com.xworkz.batch.thursday;

public class Rainbow {
	public String darkcolor;
	public int date;
	public String day;
	public double accrtime;
	public double goneon;
	public int noofcolors;
	public  String direction;
	
	
	public Rainbow(String darkcolor,int date,String day,double accrtime,double goneon,int noofcolors,String direction)
	{
	this.darkcolor=darkcolor;
	this.date=date;
	this.day=day;
	this.accrtime=accrtime;
	this.goneon=goneon;
	this.noofcolors=noofcolors;
	this.direction=direction;
	}
	public void display()
	{
		System.out.println("darkcolor is:"+this.darkcolor);
		System.out.println("date is:"+this.date);
		System.out.println("day is:"+this.day);
		System.out.println("accrtime is:"+this.accrtime);
		System.out.println("goneon is:"+this.goneon);
		System.out.println("noofcolors is:"+this.noofcolors);
		System.out.println("direction is:"+this.direction);

	}

}
