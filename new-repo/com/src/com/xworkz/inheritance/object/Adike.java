package com.xworkz.inheritance.object;

public class Adike {
	private String type;
	private double price;
	private double weigth;
	private String color;
	public Adike()
	{
		System.out.println("no arg const in adike");
	}
	@Override
	public String toString() {
		return ( "type:"+type  + "\nprice:"+price+ "\nweigth:"+weigth + "\ncolor:"+color);
	}
	@Override
	public int hashCode() {
		return 100;
	}
public void setType(String type) {
	this.type = type;
}
public void setPrice(double price) {
	this.price = price;
}
public void setWeigth(double weigth) {
	this.weigth = weigth;
}
public void setColor(String color) {
	this.color = color;
}
public String getType() {
	return type;
}
public double getPrice() {
	return price;
}
public double getWeigth() {
	return weigth;
}
public String getColor() {
	return color;
}
}
