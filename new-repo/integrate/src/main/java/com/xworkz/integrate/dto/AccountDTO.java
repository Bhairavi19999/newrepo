package com.xworkz.integrate.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AccountDTO implements Serializable, Comparable<AccountDTO> {
	@Size(min = 3, max = 20, message = " must contain 3 or more char")
	@NotNull
	@NotEmpty
	private String name;
	@Email
	private String email;
	@Min(value = 9)
	private long contactNo;
	@Size(min = 3, max = 20, message = " must contain 3 or more char")
	private String comments;
	private String fileName;
	private String contentType;
	private String originalFileName;

	@Override
	public int compareTo(AccountDTO o) {
		return 0;
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

	public String getOriginalFileName() {
		return originalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, contactNo, contentType, email, fileName, name, originalFileName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountDTO other = (AccountDTO) obj;
		return Objects.equals(comments, other.comments) && contactNo == other.contactNo
				&& Objects.equals(contentType, other.contentType) && Objects.equals(email, other.email)
				&& Objects.equals(fileName, other.fileName) && Objects.equals(name, other.name)
				&& Objects.equals(originalFileName, other.originalFileName);
	}

	@Override
	public String toString() {
		return "AccountDTO [name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", comments=" + comments
				+ ", fileName=" + fileName + ", contentType=" + contentType + ", originalFileName=" + originalFileName
				+ "]";
	}

}
