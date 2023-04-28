package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.xworkz.application.dto.constants.Langused;
import com.xworkz.application.dto.constants.OsType;
import com.xworkz.application.dto.constants.Type;

import io.smallrye.common.constraint.NotNull;

public class ApplicationDTO implements Serializable {

	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, createDate, currentVersionReleasedDate, developedBy, firstVersionReleasedDate,
				internetNeeded, langUsed, minProcessorSpeed, minRamSpaceRequired, name, nextVersionReleasedDate,
				noOfDownloads, osTypeSupported, price, rating, size, trialDays, type, version);
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
		return ageLimit == other.ageLimit && Objects.equals(createDate, other.createDate)
				&& Objects.equals(currentVersionReleasedDate, other.currentVersionReleasedDate)
				&& Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(firstVersionReleasedDate, other.firstVersionReleasedDate)
				&& internetNeeded == other.internetNeeded && langUsed == other.langUsed
				&& Double.doubleToLongBits(minProcessorSpeed) == Double.doubleToLongBits(other.minProcessorSpeed)
				&& Double.doubleToLongBits(minRamSpaceRequired) == Double.doubleToLongBits(other.minRamSpaceRequired)
				&& Objects.equals(name, other.name)
				&& Objects.equals(nextVersionReleasedDate, other.nextVersionReleasedDate)
				&& noOfDownloads == other.noOfDownloads && osTypeSupported == other.osTypeSupported
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rating == other.rating
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size) && trialDays == other.trialDays
				&& type == other.type && Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleasedDate() {
		return firstVersionReleasedDate;
	}

	public void setFirstVersionReleasedDate(LocalDate firstVersionReleasedDate) {
		this.firstVersionReleasedDate = firstVersionReleasedDate;
	}

	public LocalDate getCurrentVersionReleasedDate() {
		return currentVersionReleasedDate;
	}

	public void setCurrentVersionReleasedDate(LocalDate currentVersionReleasedDate) {
		this.currentVersionReleasedDate = currentVersionReleasedDate;
	}

	public LocalDate getNextVersionReleasedDate() {
		return nextVersionReleasedDate;
	}

	public void setNextVersionReleasedDate(LocalDate nextVersionReleasedDate) {
		this.nextVersionReleasedDate = nextVersionReleasedDate;
	}

	public int getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(int trialDays) {
		this.trialDays = trialDays;
	}

	public Langused getLangUsed() {
		return langUsed;
	}

	public void setLangUsed(Langused langUsed) {
		this.langUsed = langUsed;
	}

	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public double getMinRamSpaceRequired() {
		return minRamSpaceRequired;
	}

	public void setMinRamSpaceRequired(double minRamSpaceRequired) {
		this.minRamSpaceRequired = minRamSpaceRequired;
	}

	public boolean isInternetNeeded() {
		return internetNeeded;
	}

	public void setInternetNeeded(boolean internetNeeded) {
		this.internetNeeded = internetNeeded;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public OsType getOsTypeSupported() {
		return osTypeSupported;
	}

	public void setOsTypeSupported(OsType osTypeSupported) {
		this.osTypeSupported = osTypeSupported;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + "\n type=" + type + "\n version=" + version + "\n size=" + size
				+ "\n developedBy=" + developedBy + "\n createDate=" + createDate + "\n price=" + price
				+ "\n firstVersionReleasedDate=" + firstVersionReleasedDate + "\n currentVersionReleasedDate="
				+ currentVersionReleasedDate + "\n nextVersionReleasedDate=" + nextVersionReleasedDate + "\n trialDays="
				+ trialDays + "\n langUsed=" + langUsed + "\n minProcessorSpeed=" + minProcessorSpeed
				+ "\n minRamSpaceRequired=" + minRamSpaceRequired + "\n internetNeeded=" + internetNeeded
				+ "\n ageLimit=" + ageLimit + "\n noOfDownloads=" + noOfDownloads + "\n rating=" + rating
				+ "\n osTypeSupported=" + osTypeSupported + "]";
	}

	@NotNull
	@NotEmpty
	@Size(min=3, max=20)
	private String name;
	private Type type;
	private double version;
	private double size;
	@NotNull
	@NotEmpty
	@Size(min=3, max=20)
	private String developedBy;
	private LocalDate createDate;
	private double price;
	@Past
	private LocalDate firstVersionReleasedDate;
	@Future
	private LocalDate currentVersionReleasedDate;
	private LocalDate nextVersionReleasedDate;
	@Min(value=1)
	@Max(value=10)
	private int trialDays;
	private Langused langUsed;
	private double minProcessorSpeed;
	private double minRamSpaceRequired;
	private boolean internetNeeded;
	private int ageLimit;
	private int noOfDownloads;
	private int rating;
	private OsType osTypeSupported;

	public ApplicationDTO() {
		System.out.println("no arg const of ApplicationDTO");
	}

}
