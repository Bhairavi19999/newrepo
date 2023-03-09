package com.xworkz.associate.tuesday;

public class Sun {
	public String shape;
	public int  radius;
	
	
	public Sun(String shape,int radius)
	{
		this.shape=shape;
		this.radius=radius;
	}
	public void show()
	{
		System.out.println("shape of the sun is:"+this.shape);
		System.out.println("radius is:"+this.radius);
	}

}
