package com.xwrkz.batch.wednesday;

public class Frenchfries {
public String place;
public int cost;
public char calories;
public int length;
public int weight;
public String inventedby;
public int year;
public String manudate;
public double energy;
public boolean good;
  
public Frenchfries(String arg1)
	{
	place=arg1;
}
public Frenchfries(int arg2)
{
	cost=arg2;
}
public Frenchfries(char arg3)
{
calories=arg3;
}
public Frenchfries(boolean arg4)
{
	good=arg4;
}
public Frenchfries(String arg1,int arg2)
{
	place=arg1;
	cost=arg2;
}
public Frenchfries(int arg2,int arg5)
{
	cost=arg2;
	length=arg5;
}
public Frenchfries(boolean arg6,String arg1)
{
	good=arg6;
	place=arg1;
}
public Frenchfries(String arg1,char arg3)
{
	place=arg1;
	calories=arg3;
}
public Frenchfries(String arg1,String arg7)
{
	place=arg1;
	inventedby=arg7;
}
public Frenchfries(String arg1,double arg8)
{
	place=arg1;
	energy=arg8;
}
public void showdata() {
	System.out.println("place is:"+place);
	System.out.println("cost is:"+cost);
	System.out.println("calories is:"+calories);
	System.out.println("length is:"+length);
	System.out.println("weight is:"+weight);
	System.out.println("inventedby is:"+inventedby);
	System.out.println("year is:"+year);
	System.out.println("manudate is:"+manudate);
	System.out.println("energy is:"+energy);
	System.out.println("good is:"+good);

}

}



