package com.xworkz.chain;

public class Iron {
	public String brand;
	public  String companyname;
	public  double weigth;
	public  String usedto;
	public  String type;
	public  int cost;
	public boolean good;
	public int length;
	public int atomicnumber;
	public double atomicmass;
	
	
	public Iron()
	{
		System.out.println("IRON");
	}
	public Iron(String brand)
	{
		this.brand=brand;
		System.out.println("IRON");
	}
	public Iron(String brand, String companyname)
	{
		this(brand);
		this.companyname=companyname;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth)
	{
		this(brand,companyname);
		this.weigth=weigth;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth, String usedto)
	{
		this(brand,companyname,weigth);
		this.usedto=usedto;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth, String usedto,String type)
	{
		this(brand,companyname,weigth,usedto);
		this.type=type;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth, String usedto,String type,int cost)
	{
		this(brand,companyname,weigth,usedto,type);
		this.cost=cost;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth, String usedto,String type,int cost,boolean good)
	{
		this(brand,companyname,weigth,usedto,type,cost);
		this.good=good;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth, String usedto,String type,int cost,boolean good,int length)
	{
		this(brand,companyname,weigth,usedto,type,cost,good);
		this.length=length;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth, String usedto,String type,int cost,boolean good,int length,int atomicnumber)
	{
		this(brand,companyname,weigth,usedto,type,cost,good,length);
		this.atomicnumber=atomicnumber;
         System.out.println("IRON");
	}
	public Iron(String brand, String companyname,double weigth, String usedto,String type,int cost,boolean good,int length,int atomicnumber, double atomicmass)
	{
		this(brand,companyname,weigth,usedto,type,cost,good,length,atomicnumber);
		this.atomicmass=atomicmass;
         System.out.println("IRON");
	}
	public void inti(String brand, String companyname,double weigth, String usedto,String type,int cost,boolean good,int length,int atomicnumber, double atomicmass)
	{
		this.brand=brand;
		this.companyname=companyname;
		this.weigth=weigth;
		this.usedto=usedto;
		this.type=type;
		this.cost=cost;
		this.good=good;
		this.length=length;
		this.atomicnumber=atomicnumber;
		this.atomicmass=atomicmass;
}
	public void  show()
	{
		System.out.println("ABOUT IRON");
		System.out.println("brand is:"+brand);
		System.out.println("companyname is:"+companyname);
		System.out.println("weigth is:"+weigth);
		System.out.println("usedto is:"+usedto);
		System.out.println("type is:"+type);
		System.out.println("cost is:"+cost);
		System.out.println("good is:"+good);
		System.out.println("length is:"+length);
		System.out.println("atomicnumber is:"+atomicnumber);
		System.out.println("atomicmass is:"+atomicmass);
}

}
