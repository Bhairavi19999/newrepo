package com.xworkz.associate;

public class Shirt {
	public int size;
	public String threadcolors;
	public int length;
	public Botton botton=new Botton();
	public void inti(int size, String threadcolors,int length)
	{
this.size=size;
this.threadcolors=threadcolors;
this.length=length;
}
	public void display()
	{
		System.out.println("size of shirt is:"+size);
		System.out.println("colors of the thread:"+threadcolors);
		System.out.println("length of the shirt is:"+length);
		this.botton.show();
	}
}
