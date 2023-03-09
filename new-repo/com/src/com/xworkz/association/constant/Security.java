package com.xworkz.association.constant;

public class Security {
public String deptName;
public int totalStaff;
public String headStaff;
public Company company;


public void setinfo( String deptName,int totalStaff,String headStaff)
{
	this.deptName=deptName;
	this.totalStaff=totalStaff;
	this.headStaff=headStaff;
}
public void setCompany( Company company)
{
	this.company=company;
}

public void display()
{
	System.out.println("department name is:"+this.deptName);
	System.out.println("totalStaff in the department  is:"+this.totalStaff);
	System.out.println("headStaff in the department  is:"+this.headStaff);
	if(company!=null)
	{
		this.company.display();
	}
	else
	{
		System.out.println("this.company is pointing to null");
	}
	System.out.println("     ");
}
}
