package com.xworkz.associate.wednesday;

public class Isro {
	public String[] location;
	public int[] satelliteNos;
	public Scientist[] scientist;
	
	public Isro()
	{
		System.out.println("no-arg of cons...");
	}
	
	
public void setLocation(String[] location)
{
	this.location=location;
}


public void setSatelliteNos(int[] satelliteNos)
{
	this.satelliteNos=satelliteNos;
}

public void setScientist(Scientist[] scientist)
{
this.scientist=scientist;
}



public void display()
{
	if(this.location!=null)
	{
		for(int seq=0;seq<this.location.length;seq++)
		{
			String element=this.location[seq];
			System.out.println("location "+element);
		}
	}
	else
	{
		System.err.println("this.location is not pointing to any memory");
	}
	
	
	if(this.satelliteNos!=null)
	{
		for( int num =0;num<this.satelliteNos.length;num++)
		{
			int element=this.satelliteNos [num];
			System.out.println("satelliteNos "+element);
		}
	}
	else
	{
		System.err.println("this.satelliteNos is not pointing to any memory");
	}
	if(this.scientist!=null)
	{
		for(int seq=0;seq<this.scientist.length;seq++)
		{
			Scientist element=this.scientist[seq];
			element.show();
		}
	}
}

}
