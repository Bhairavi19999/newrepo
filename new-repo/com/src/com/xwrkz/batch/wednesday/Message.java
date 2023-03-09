package com.xwrkz.batch.wednesday;

public class Message {
	String from;
	String to;
	int year;
	double time;
	boolean replay;
public void showdata()
{
	System.out.println("from:"+from);
	System.out.println("to:"+to);
	System.out.println("year:"+year);
	System.out.println("time:"+time);
	System.out.println("replay:"+replay);
}
public Message(String arg1)
{
	from=arg1;
}
public Message(String arg1,String arg2)
{
	from=arg1;
	to=arg2;
}
public Message(String arg1,int arg3)
{
	from=arg1;
	year=arg3;
}
public Message(String arg1,int arg3,String arg2)
{
	from=arg1;
	year=arg3;
	to=arg2;
}
public Message(boolean arg4)
{
	replay=arg4;
}
}
