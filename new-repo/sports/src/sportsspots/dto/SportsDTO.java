package sportsspots.dto;

import java.io.Serializable;

public class SportsDTO implements Serializable {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlyers() {
		return noOfPlyers;
	}

	public void setNoOfPlyers(int noOfPlyers) {
		this.noOfPlyers = noOfPlyers;
	}

	public String getPlaces() {
		return places;
	}

	public void setPlaces(String places) {
		this.places = places;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SportsDTO [name=" + name + ", noOfPlyers=" + noOfPlyers + ", places=" + places + ", salary=" + salary
				+ "]";
	}

	private String name;
	private int noOfPlyers;
	private String places;
	private double salary;

	public SportsDTO(String name, int noOfPlyers, String places, double salary) {
		this.name = name;
		this.noOfPlyers = noOfPlyers;
		this.places = places;
		this.salary = salary;
	}
}
