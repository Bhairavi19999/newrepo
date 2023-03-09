package com.xworkz.inheritance.object;

public class Gold {
	private int gram;
	private String buyersname;
	private double price;
	private String shopname;
	public Gold()
	{
		System.out.println(" no arg const in gold");
	}
	@Override
	public String toString() 
	{
		return( "gram:"+gram  + "\nbuyersname:"+buyersname+ "\nprice:"+price + "\nshopname:"+shopname);
	}
	@Override
	public int hashCode()
	{
		return 90;
	}
public void setBuyersname(String buyersname)
{
	this.buyersname = buyersname;
}
public void setGram(int gram) 
{
	this.gram = gram;
}
public void setPrice(double price)
{
	this.price = price;
}
public void setShopname(String shopname)
{
	this.shopname = shopname;
}
public String getBuyersname() 
{
	return buyersname;
}
public int getGram() 
{
	return gram;
}
public double getPrice()
{
	return price;
}
public String getShopname()
{
	return shopname;
}
}
