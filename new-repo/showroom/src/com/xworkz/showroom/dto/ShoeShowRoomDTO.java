package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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

	public ShoeShowRoomDTO() {
		System.out.println("running ShoeShowRoomDTO with no arg cons...");
	}

	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		return this.name.compareTo(o.name);
	}

//	@Override
//	public int compareTo(ShoeShowRoomDTO o) {
//		return name.compareTo(o.getName());
//	}

}
