package com.xworkz.headphone.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.headphone.constants.Brand;
import com.xworkz.headphone.constants.Color;
import com.xworkz.headphone.constants.WeightAndType;

public class HeadphoneDTO implements Serializable {
	@Override
	public int hashCode() {
		return Objects.hash(bass, brand, color, customerName, invoiceNo, mfgDate, modelNo, price, warrantyPeriod,
				weightAndType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadphoneDTO other = (HeadphoneDTO) obj;
		return bass == other.bass && brand == other.brand && color == other.color
				&& Objects.equals(customerName, other.customerName) && invoiceNo == other.invoiceNo
				&& Objects.equals(mfgDate, other.mfgDate) && Objects.equals(modelNo, other.modelNo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& warrantyPeriod == other.warrantyPeriod && weightAndType == other.weightAndType;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public WeightAndType getWeightAndType() {
		return weightAndType;
	}

	public void setWeightAndType(WeightAndType weightAndType) {
		this.weightAndType = weightAndType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "HeadphoneDTO [brand=" + brand + "\n modelNo=" + modelNo + "\n price=" + price + "\n bass=" + bass
				+ "\n color=" + color + "\n weightAndType=" + weightAndType + "\n customerName=" + customerName
				+ "\n invoiceNo=" + invoiceNo + "\n mfgDate=" + mfgDate + "\n warrantyPeriod=" + warrantyPeriod + "]";
	}

	public HeadphoneDTO(Brand brand, String modelNo, double price, boolean bass, Color color,
			WeightAndType weightAndType, String customerName, int invoiceNo, LocalDate mfgDate, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.modelNo = modelNo;
		this.price = price;
		this.bass = bass;
		this.color = color;
		this.weightAndType = weightAndType;
		this.customerName = customerName;
		this.invoiceNo = invoiceNo;
		this.mfgDate = mfgDate;
		this.warrantyPeriod = warrantyPeriod;
	}

	public HeadphoneDTO() {
		System.out.println("no arg cont of headphone");
	}

	private Brand brand;
	private String modelNo;
	private double price;
	private boolean bass;
	private Color color;
	private WeightAndType weightAndType;
	private String customerName;
	private int invoiceNo;
	private LocalDate mfgDate;
	private int warrantyPeriod;

}
