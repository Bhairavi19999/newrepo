package com.xworkz.desert.dto;

import java.io.Serializable;
import java.util.Objects;

public class DesertDTO implements Serializable {
	@Override
	public String toString() {
		return "DesertDTO \n[id=" + id + "\n name=" + name + "\n country=" + country + "\n area=" + area + "\n maxTemp="
				+ maxTemp + "\n minTemp=" + minTemp + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, country, id, maxTemp, minTemp, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DesertDTO other = (DesertDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(country, other.country) && id == other.id
				&& Double.doubleToLongBits(maxTemp) == Double.doubleToLongBits(other.maxTemp)
				&& Double.doubleToLongBits(minTemp) == Double.doubleToLongBits(other.minTemp)
				&& Objects.equals(name, other.name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	private int id;
	private String name;
	private String country;
	private String area;
	private double maxTemp;
	private double minTemp;

	public DesertDTO(int id, String name, String country, String area, double maxTemp, double minTemp) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.area = area;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}
}
