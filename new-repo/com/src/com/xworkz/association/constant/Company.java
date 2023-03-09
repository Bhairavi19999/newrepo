package com.xworkz.association.constant;

public class Company {
	public String name;
	public String CEOname;
	public int since;
	public Country country;
	
	
	
	public void setinfo(String name, String CEOname,int since)
	{
		this.name=name;
		this.CEOname=CEOname;
		this.since=since;
		}
	
	
      public void setCountry(Country country)
      {
    	  this.country=country;
      }
      
      public void display()
      {
    	  System.out.println("company name is:"+this.name);
    	  System.out.println("CEO name is:"+this.CEOname);
    	  System.out.println("since:"+this.since);
    	  if(country!=null)
    	  {
    		  this.country.display();
    	  }
    	  else
    	  {
    		  System.out.println("this.country is pointing to null");
    	  }
    	  System.out.println( "       ");
      }
}
