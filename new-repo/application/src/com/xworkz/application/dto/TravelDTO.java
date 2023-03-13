package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO implements Serializable {

	public TravelDTO() {
		System.out.println("no arg const of TravelDTO");
	}

	@Override
	public int hashCode() {
		return Objects.hash(from, noOfTraverlers, to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(from, other.from) && noOfTraverlers == other.noOfTraverlers
				&& Objects.equals(to, other.to);
	}

	@Override
	public String toString() {
		return "TravelDTO [from=" + from + "\nto=" + to + "\n ticketPrice=" + ticketPrice + "\n departedDate="
				+ departedDate + "\n noOfTraverlers=" + noOfTraverlers + "]";
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public LocalDate getDepartedDate() {
		return departedDate;
	}

	public void setDepartedDate(LocalDate departedDate) {
		this.departedDate = departedDate;
	}

	public int getNoOfTraverlers() {
		return noOfTraverlers;
	}

	public void setNoOfTraverlers(int noOfTraverlers) {
		this.noOfTraverlers = noOfTraverlers;
	}

	private String from;
	private String to;
	private double ticketPrice;
	private LocalDate departedDate;
	private int noOfTraverlers;
}
