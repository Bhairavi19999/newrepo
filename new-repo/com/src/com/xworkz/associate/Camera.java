package com.xworkz.associate;

public class Camera {
	public double pixcel;
	public boolean flas;
	public String lens;
	public void inti(double pixcel,boolean flas,String lens)
	{
		this.pixcel=pixcel;
		this.flas=flas;
		this.lens=lens;
	}
	public void show()
	{
		System.out.println("pixcel range  is:"+pixcel);
		System.out.println("flas is needed :"+flas);
		System.out.println("type of lens is:"+lens);
	}
}
