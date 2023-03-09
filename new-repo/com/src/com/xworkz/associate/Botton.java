package com.xworkz.associate;

public class Botton {
public double weigth;
public String shape;
public int holes;
public void inti(double weigth,String shape,int holes)
{
	this.weigth=weigth;
	this.shape=shape;
	this.holes=holes;
}
public void show()
{
	System.out.println("weigth of the botton is:"+weigth);
	System.out.println("shape of botton is:"+shape);
	System.out.println("holes in the botton are:"+holes);
}
}
