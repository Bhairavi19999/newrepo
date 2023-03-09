package com.xworkz.associate;

public class Xworkz {
	public String CEO;
	public int trainees;
	public int laptops;
	public Trainer trainer=new Trainer();
	public void inti( String CEO,int trainees,int laptops)
	{
		this.CEO=CEO;
		this.trainees=trainees;
		this.laptops=laptops;
	}
	public void display()
	{
System.out.println("name of CEO is:"+CEO);
System.out.println("total number of trainees is:"+trainees);
System.out.println("total number of laptops is:"+laptops);
this.trainer.show();
	}
}

