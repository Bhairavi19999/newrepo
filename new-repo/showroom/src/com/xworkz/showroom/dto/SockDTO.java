package com.xworkz.showroom.dto;

import java.io.Serializable;
import java.util.Objects;

public class SockDTO implements Serializable, Comparable<SockDTO> {
	private String brand;

	@Override
	public int compareTo(SockDTO o) {
		return brand.compareTo(o.getBrand());
	}

	public SockDTO(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SockDTO other = (SockDTO) obj;
		return Objects.equals(brand, other.brand);
	}

	@Override
	public String toString() {
		return "SockDTO [brand=" + brand + "]";
	}

}
