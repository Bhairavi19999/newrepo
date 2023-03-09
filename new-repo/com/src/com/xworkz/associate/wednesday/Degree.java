package com.xworkz.associate.wednesday;

public class Degree {
	public String name;
	public int duration;
	public boolean pursuing;
	public double percentage;
	public String branch;
	
	
	
	public void setinfo( String name,int duration,boolean pursuing,double percentage,String branch)
	{
		this.name=name;
		this.duration=duration;
		this.pursuing=pursuing;
		this.percentage=percentage;
		this.branch=branch;
	}
	 public void show()
	 {
		 System.out.println("course is:"+name);
		 
		 System.out.println("duration is:"+duration);

		 System.out.println("pursuing is:"+pursuing);

		 System.out.println("percentage is:"+percentage);

		 System.out.println("branch is:"+branch);
		 
			System.out.println("            ");



	 }

}
