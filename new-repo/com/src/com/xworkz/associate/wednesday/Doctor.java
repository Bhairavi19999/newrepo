package com.xworkz.associate.wednesday;

public class Doctor {
	public String name;
	public String[] specilization;
	public double experience;
	
	public void setinfo(String name,double experience)
	{
		this.name=name;
		this.experience=experience;
	}
	public void setSpec(String[] specilization)
	{
		this.specilization=specilization;
	}
	public void show()
	{
		System.out.println("doctor name is:"+this.name);
		System.out.println("experience is:"+this.experience);
		 
		
		if(this.specilization!=null)
		{
			for(int num=0;num<this.specilization.length;num++)
			{
				String element=this.specilization[num];
				System.out.println("specilization in:"+element);
			}
			
		}
		else
		{
			System.out.println("this.specilization is not pointing to any memory");
		}
		System.out.println("     ");

	}

}
