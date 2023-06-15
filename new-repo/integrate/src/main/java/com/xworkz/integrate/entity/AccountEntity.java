package com.xworkz.integrate.entity;

import java.util.Objects;

public class AccountEntity {
	private int id;
	private String name;
	private String email;
	private long contactNo;
	private String comments;
	private String fileName;
	private String contentType;

	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", comments=" + comments + ", fileName=" + fileName + ", contentType=" + contentType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, contactNo, contentType, email, fileName, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountEntity other = (AccountEntity) obj;
		return Objects.equals(comments, other.comments) && contactNo == other.contactNo
				&& Objects.equals(contentType, other.contentType) && Objects.equals(email, other.email)
				&& Objects.equals(fileName, other.fileName) && id == other.id && Objects.equals(name, other.name);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
