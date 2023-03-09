package com.xworkz.override;

public class Tigeress  extends Tiger{
public Tigeress()
{
	System.out.println("no arg const in Tigeress");
}
@Override
public void anger()
{
	System.out.println("running anger in tigeress");
}
}
