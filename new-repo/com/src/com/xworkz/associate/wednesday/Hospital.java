package com.xworkz.associate.wednesday;

public class Hospital {
	public String name;
	public Doctor[] doctor;
	
	public void setName(String name)
	{
		this.name=name;
	} 
	
	
	public void setDoctor(Doctor[] doctor)
	{
		this.doctor=doctor;
	}
	
	public void display()
	{
		System.out.println("hospitalname is:"+this.name);
		System.out.println("   ");
		
		if(this.doctor!=null)
		{
			for(int seq=0;seq<this.doctor.length;seq++)
			{
				Doctor element=this.doctor[seq];
				element.show();
			}
		}
	}
	

}
