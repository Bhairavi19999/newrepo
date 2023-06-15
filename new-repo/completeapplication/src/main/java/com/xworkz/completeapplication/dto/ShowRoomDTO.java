package com.xworkz.completeapplication.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Configuration
@Component
public class ShowRoomDTO implements Serializable, Comparable<ShowRoomDTO> {
	@NotNull
	@Size(min = 5, max = 45, message = "it must have more 5 letters")
	private String showroomName;
	@NotNull
	@Size(min = 5, max = 45, message = "it must have more 5 letters")
	private String customerName;
	@NotNull
	@Size(min = 5, max = 45, message = "it must have more 5 letters")

	private String address;
	@NotNull
	@Size(min = 5, max = 45, message = "it must have more 5 letters")

	private String carBrand;
	@NotNull
	@Size(min = 3, max = 45, message = "it must have more 3 letters")

	private String color;

	@Min(value = 9)
	private long contactno;
	@Min(value = 5)
	private int warranty;
	@Min(value = 9)
	private int price;

	@Override
	public int compareTo(ShowRoomDTO o) {
		return this.getCustomerName().compareTo(o.getCustomerName());
	}

	@Override
	public String toString() {
		return "ShowRoomDTO [showroomName=" + showroomName + ", customerName=" + customerName + ", address=" + address
				+ ", carBrand=" + carBrand + ", color=" + color + ", contactno=" + contactno + ", warranty=" + warranty
				+ ", price=" + price + "]";
	}

	public String getShowroomName() {
		return showroomName;
	}

	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, carBrand, color, contactno, customerName, price, showroomName, warranty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShowRoomDTO other = (ShowRoomDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(carBrand, other.carBrand)
				&& Objects.equals(color, other.color) && contactno == other.contactno
				&& Objects.equals(customerName, other.customerName) && price == other.price
				&& Objects.equals(showroomName, other.showroomName) && warranty == other.warranty;
	}

}
