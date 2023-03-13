package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AwarenessDTO implements Serializable {
	@Override
	public int hashCode() {
		return Objects.hash(createdBy, date, followedBy, noEnd, preventation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AwarenessDTO other = (AwarenessDTO) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(date, other.date)
				&& Objects.equals(followedBy, other.followedBy) && noEnd == other.noEnd
				&& Objects.equals(preventation, other.preventation);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getPreventation() {
		return preventation;
	}

	public void setPreventation(String preventation) {
		this.preventation = preventation;
	}

	public boolean isNoEnd() {
		return noEnd;
	}

	public void setNoEnd(boolean noEnd) {
		this.noEnd = noEnd;
	}

	public String getFollowedBy() {
		return followedBy;
	}

	public void setFollowedBy(String followedBy) {
		this.followedBy = followedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "AwarenessDTO [date=" + date + "\n preventation=" + preventation + "\n noEnd=" + noEnd + "\n followedBy="
				+ followedBy + "\n createdBy=" + createdBy + "]";
	}

	private LocalDate date;
	private String preventation;
	private boolean noEnd;
	private String followedBy;
	private String createdBy;

	public AwarenessDTO() {
		System.out.println("no arg const of AwarenessDTO");
	}

}
