package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class MarketDTO implements Serializable {
	@Override
	public int hashCode() {
		return Objects.hash(famousFor, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return Objects.equals(famousFor, other.famousFor) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + "\n price=" + price + "\n size=" + size + "\n famousFor=" + famousFor
				+ "\n location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String name;
	private double price;
	private double size;
	private String famousFor;
	private String location;

	public MarketDTO() {
		System.out.println("no arg const MarketDTO");
	}

}
