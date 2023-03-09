package com.xworkz.associate.tuesday;

public class Gift {
	public String item;
	public int cost;
	public Box box;
	public Gift()
	{
		System.out.println("no argu const");
	}
public Gift(String item,int cost)
{
	this.item=item;
	this.cost=cost;
}
public void init(Box box)
{
	this.box=box;
}
public void display()
{
	System.out.println("item is:"+this.item);
	System.out.println("cost is:"+this.cost);
	if(box!=null)
	{
		this.box.show();
	}
	else
	{
		System.err.println("box  is not pointing any address");
	}

}
}
