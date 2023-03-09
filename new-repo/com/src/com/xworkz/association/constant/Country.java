package com.xworkz.association.constant;

public class Country {
	public String name;
	public String president;
	public boolean developed;
	public State state;
	
	public void setinfo(String name,String president,boolean developed)
	{
		this.name=name;
		this.president=president;
		this.developed=developed;
	}
	
	
    public void setState(State state)
    {
    	this.state=state;
    }
    
    public void display()
    {
    	System.out.println("country name is:"+this.name);
    	System.out.println("president name is:"+this.president);
        System.out.println("developed is:"+this.developed);
        if(state!=null)
        {
        	this.state.display();
        }
        else
        {
        	System.out.println("this.state is pointing to null");
        }
        System.out.println("         ");
    }

}
