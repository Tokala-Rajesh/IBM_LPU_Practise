package com.example.demo;

import org.springframework.stereotype.Component;

//import javax.persistence.Entity;

//@Entity
//@Table(name="contact")
@Component
public class ContactModel
{
	private String name;
	private String email;
	private String message;
	public ContactModel(String name, String email, String message) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
	}
	public ContactModel() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactModel [name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	
	
	

}
