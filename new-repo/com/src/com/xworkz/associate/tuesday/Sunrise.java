package com.xworkz.associate.tuesday;

public class Sunrise {
	public String direction;
	public int time;
	public Sun sun;
	public Sunrise()
	{
		System.out.println("no argu const");
	}
	public Sunrise( String direction,int time)
	{
		this.direction=direction;
		this.time=time;
	}
	public  void init(Sun sun)
	{
		this.sun=sun;
	}
	public void display()
	{
		System.out.println("direction of sun rise:"+this.direction);
		System.out.println("timings of sun rise:"+this.time);
		if(sun!=null) {
			this.sun.show();
		}
		else
		{
			System.err.println("sun is not pointing to any address");
		}

	}

}
