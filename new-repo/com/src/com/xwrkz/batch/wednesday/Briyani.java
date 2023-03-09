package com.xwrkz.batch.wednesday;

public class Briyani {
	String type;
	String ingredient;
	int cost;
	int measurement;
	int calories;
	boolean good;
	String prepredby;
	String prepredto;
	String place;
	String event;
	String manuday;
	double energy;
	public void showdata()
	{
		System.out.println("type is:"+type);
		System.out.println("ingredient is:"+ingredient);
		System.out.println("cost is:"+cost);
		System.out.println("measurement is:"+measurement);
		System.out.println("calories is:"+calories);
		System.out.println("good is:"+good);
		System.out.println("prepredby is:"+prepredby);
		System.out.println("prepredto is:"+prepredto);
		System.out.println("place is:"+place);
		System.out.println("event is:"+event);
		System.out.println("manuday is:"+manuday);
		System.out.println("energy is:"+energy);
}
public Briyani(String arg1)
{
type=arg1;	
}
public Briyani(String arg1,String arg2)
{
type=arg1;
ingredient=arg2;
}
public Briyani(String arg1,int arg3)
{
type=arg1;
cost=arg3;
}
public Briyani(int arg3,String arg1)
{
	arg3=cost;
type=arg1;	
}
public Briyani(double arg4)
{
arg4=energy;	
}
public Briyani(String arg1,double arg4)
{
type=arg1;
arg4=energy;
}
public Briyani(double arg4,int arg3)
{
	arg4=energy;
	arg3=cost;

}
public Briyani(boolean arg5)
{
good=arg5;	
}
public Briyani(String arg1,boolean arg5)
{
type=arg1;	
good=arg5;	

}
public Briyani(int arg3,boolean arg5)
{
cost=arg3;
good=arg5;	
}
public Briyani(String arg1,String arg2,String arg6)
{
type=arg1;
ingredient=arg2;
event=arg6;	
}
public Briyani(int arg7,int arg3)
{
	measurement=arg7;
cost=arg3;
}
public Briyani(int arg3,boolean arg5,String arg1)
{
cost=arg3;
good=arg5;
type=arg1;
}
public Briyani(int arg7,int arg3,String arg1)
{
	measurement=arg7;
cost=arg3;
type=arg1;
}
public Briyani(String arg1,boolean arg5,String arg6)
{
type=arg1;	
good=arg5;	
event=arg6;
}
}




