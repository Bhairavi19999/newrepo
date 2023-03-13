package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AttendenceDTO implements Serializable {
	private String name;
	private LocalDate attendenceOn;
	private int totalNoOfWorkers;
	private String location;
	private int noOfAttended;

	@Override
	public String toString() {
		return "AttendenceDTO [name=" + name + "\n attendenceOn=" + attendenceOn + "\n totalNoOfWorkers="
				+ totalNoOfWorkers + "\nlocation=" + location + "\n noOfAttended=" + noOfAttended + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendenceDTO other = (AttendenceDTO) obj;
		return Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}

	public AttendenceDTO() {
		System.out.println("no arg const of AttendenceDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getAttendenceOn() {
		return attendenceOn;
	}

	public void setAttendenceOn(LocalDate attendenceOn) {
		this.attendenceOn = attendenceOn;
	}

	public int getTotalNoOfWorkers() {
		return totalNoOfWorkers;
	}

	public void setTotalNoOfWorkers(int totalNoOfWorkers) {
		this.totalNoOfWorkers = totalNoOfWorkers;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfAttended() {
		return noOfAttended;
	}

	public void setNoOfAttended(int noOfAttended) {
		this.noOfAttended = noOfAttended;
	}

}
