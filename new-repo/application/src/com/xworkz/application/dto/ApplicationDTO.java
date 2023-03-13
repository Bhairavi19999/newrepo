package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class ApplicationDTO implements Serializable {
	@Override
	public int hashCode() {
		return Objects.hash(currentlyUsedBy, developedBy, launchedOn, name, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(currentlyUsedBy, other.currentlyUsedBy) && Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(launchedOn, other.launchedOn) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + "\n version=" + version + "\n developedBy=" + developedBy
				+ "\n launchedOn=" + launchedOn + "\n currentlyUsedBy=" + currentlyUsedBy + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public LocalDate getLaunchedOn() {
		return launchedOn;
	}

	public void setLaunchedOn(LocalDate launchedOn) {
		this.launchedOn = launchedOn;
	}

	public String getCurrentlyUsedBy() {
		return currentlyUsedBy;
	}

	public void setCurrentlyUsedBy(String currentlyUsedBy) {
		this.currentlyUsedBy = currentlyUsedBy;
	}

	private String name;
	private double version;
	private String developedBy;
	private LocalDate launchedOn;
	private String currentlyUsedBy;

	public ApplicationDTO() {
		System.out.println("no arg const of ApplicationDTO");
	}
//	

}
