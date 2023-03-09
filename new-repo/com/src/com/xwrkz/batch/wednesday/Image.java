package com.xwrkz.batch.wednesday;

public class Image {
	String type;
	int pixel;
	double length;
	int width;
	int height;
	String shape;
	boolean copy;
	int number;
	String place;
	String formate;
	public  void showdata()
	{
System.out.println("type is:"+type);
System.out.println("pixel is:"+pixel);
System.out.println("length is:"+length);
System.out.println("width is:"+width);
System.out.println("height is:"+height);
System.out.println("shape is:"+shape);
System.out.println("copy is:"+copy);
System.out.println("number is:"+number);
System.out.println("place is:"+place);
System.out.println("formate is:"+formate);
}
	public Image(String arg1)
	{
		type=arg1;
	}
	public Image(int arg2)
	{
		pixel=arg2;
	}
	public Image(double arg3)
	{
		length=arg3;
	}
	public Image(boolean arg4)
	{
		copy=arg4;
	}
	public Image(String arg1,String arg5)
	{
		type=arg1;
		place=arg5;
	}
	public Image(String arg1,String arg5,String arg6)
	{
		type=arg1;
		place=arg5;
		formate=arg6;
	}
	public Image(String arg1,int arg2)
	{
		type=arg1;
		pixel=arg2;
	}
	public Image(String arg1,double arg3)
	{
		type=arg1;
		length=arg3;
	}
	public Image(String arg1,boolean arg4)
	{
		type=arg1;
		copy=arg4;
	}
	public Image(String arg1,String arg5,boolean arg4)
	{
		type=arg1;
		place=arg5;
		copy=arg4;
	}
}





