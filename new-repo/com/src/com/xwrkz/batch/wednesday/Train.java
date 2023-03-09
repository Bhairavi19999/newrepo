package com.xwrkz.batch.wednesday;

public class Train {
	String name;
	int number;
	String type;
	double length;
	String from;
	String to;
	int platform;
	boolean running;
	public void showdata()
	{
		System.out.println("name is:"+name);
		System.out.println("number is:"+number);
		System.out.println("type is:"+type);
		System.out.println("length is:"+length);
		System.out.println("from is:"+from);
		System.out.println("to is:"+to);
		System.out.println("platform is:"+platform);
		System.out.println("running is:"+running);

	}
	public Train(String arg1)
	{
	name=arg1;
	}
	public Train(int arg2)
	{
		number=arg2;
	}
	public Train(double arg3)
	{
		length=arg3;
	}
	public Train(String arg1,String arg4)
	{
		name=arg1;
		from=arg4;
	}
	public Train(String arg1,String arg4,String arg5)
	{
		name=arg1;
		from=arg4;
		to=arg5;
	}
	public Train(String arg1,int arg2)
	{
		name=arg1;
		number=arg2;		
	}
	public Train(String arg1,double arg3)
	{
		name=arg1;
		length=arg3;
       }
	public Train(int arg2,double arg3)
	{
		number=arg2;
		length=arg3;
     }
}




