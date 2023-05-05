package com.xworkz.showroom.dto;

import java.io.Serializable;
import java.util.Objects;

public class PolishDTO implements Serializable, Comparable<PolishDTO> {
	public PolishDTO(String color) {
		super();
		this.color = color;
	}

	private String color;

	@Override
	public String toString() {
		return "PolishDTO [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolishDTO other = (PolishDTO) obj;
		return Objects.equals(color, other.color);
	}

	@Override
	public int compareTo(PolishDTO o) {
		return color.compareTo(o.getColor());
	}

}
