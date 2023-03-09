package com.xworkz.inheritance.object;

public class Coconut {
	private double price;
	private double weight;
	private String shape;
	private String treename;
	public Coconut()
	{
		System.out.println("no arg const in coconut");
	}
	@Override
	public String toString() {
		return( "price:"+price  + "\nweight:"+weight+ "\nshape:"+shape + "\ntreename:"+treename);
	}
	@Override
	public int hashCode() {
		return 150;
	}
public void setPrice(double price) {
	this.price = price;
}
public void setShape(String shape) {
	this.shape = shape;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public void setTreename(String treename) {
	this.treename = treename;
}
public double getPrice() {
	return price;
}
public String getShape() {
	return shape;
}
public String getTreename() {
	return treename;
}
public double getWeight() {
	return weight;
}
}
