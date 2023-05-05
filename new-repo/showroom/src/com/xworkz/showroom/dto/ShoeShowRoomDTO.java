package com.xworkz.showroom.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class ShoeShowRoomDTO implements Serializable, Comparable<ShoeShowRoomDTO> {
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100, message = "value should be greater than 100")
	private int id;
	@Size(min = 3, max = 20, message = "length must between 3 to 20 ")

	private String name;
	@Size(min = 3, max = 20, message = "length must between 3 to 20 ")

	private String address;
	@Size(min = 3, max = 20, message = "length must between 3 to 20 ")

	private String gst;

	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		return this.name.compareTo(o.name);
	}

	public ShoeShowRoomDTO(int id, String name, String address, String gst) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gst = gst;
	}

	@Override
	public String toString() {
		return "ShoeShowRoomDTO [id=" + id + ", name=" + name + ", address=" + address + ", gst=" + gst + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, gst, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoeShowRoomDTO other = (ShoeShowRoomDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(gst, other.gst) && id == other.id
				&& Objects.equals(name, other.name);
	}

//	@Override
//	public int compareTo(ShoeShowRoomDTO o) {
//		return name.compareTo(o.getName());
//	}

	
}
