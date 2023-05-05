package com.xworkz.showroom.dto;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;
@Data
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO> {
	private String name;

	@Override
	public int compareTo(SalesManagerDTO o) {
		return name.compareTo(o.getName());
	}

	public SalesManagerDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesManagerDTO other = (SalesManagerDTO) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "SalesManagerDTO [name=" + name + "]";
	}

}
