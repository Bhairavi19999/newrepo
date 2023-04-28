package com.xwrkz.optional.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xwrkz.optional.cons.Type;

public class SnakeDTO implements Serializable,Comparable<SnakeDTO> {
	@Override
	public String toString() {
		return "SnakeDTO [id=" + id + ", name=" + name + ", place=" + place + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, place, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnakeDTO other = (SnakeDTO) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(place, other.place)
				&& type == other.type;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	private int id;
	private String name;
	private String place;
	private Type type;

	public SnakeDTO(int id, String name, String place, Type type) {
		this.id = id;
		this.name = name;
		this.place = place;
		this.type = type;
	}

	@Override
	public int compareTo(SnakeDTO o) {
		if(this.name!=null) {
			return this.getName().compareTo(o.getName());
		}
		return 0;
	}

}
