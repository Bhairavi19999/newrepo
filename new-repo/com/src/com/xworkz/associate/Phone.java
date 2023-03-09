package com.xworkz.associate;

public class Phone {
	public int apps;
	public String pouch;
	public int pictures;
	public  Camera camera= new Camera();
	public void inti(int apps,String pouch,int pictures)
	{
		this.apps=apps;
		this.pouch=pouch;
		this.pictures=pictures;
	}
	public void display()
	{
		System.out.println("number of apps in a phone is:"+apps);
		System.out.println("phone has a pouch is:"+pouch);
		System.out.println("number of pictures  is:"+pictures);
		this.camera.show();
}
}
