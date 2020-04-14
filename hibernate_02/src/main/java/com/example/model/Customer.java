package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer1")
public class Customer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -233551355754841290L;
	@Id
	private String customerid;
	@Column(name="customer_name")
	private String CustomerName;
	@Column(name = "email")
	private String email;
	@Column(name="isactive")
	private boolean isActive;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerid, String customerName, String email, boolean isActive) {
		super();
		this.customerid = customerid;
		CustomerName = customerName;
		this.email = email;
		this.isActive = isActive;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", CustomerName=" + CustomerName + ", email=" + email
				+ ", isActive=" + isActive + "]";
	}
	

}
