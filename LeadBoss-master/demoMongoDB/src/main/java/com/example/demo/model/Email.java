package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Email 
{
	 @Id
	 private String id;

	 private String to;
	 private String subject;
	 private Date dateOfEmail;
	 private String message;
	 public Email(String id, String to, String subject, Date dateOfEmail, String message) {
		super();
		this.id = id;
		this.to = to;
		this.subject = subject;
		this.dateOfEmail = dateOfEmail;
		this.message = message;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getDateOfEmail() {
		return dateOfEmail;
	}
	public void setDateOfEmail(Date dateOfEmail) {
		this.dateOfEmail = dateOfEmail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	 
}
