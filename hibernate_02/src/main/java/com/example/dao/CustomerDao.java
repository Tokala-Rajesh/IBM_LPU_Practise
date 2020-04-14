package com.example.dao;

import java.util.List;

import com.example.model.Customer;

public interface CustomerDao
{
	public Customer createCustomer(Customer customer);
	public List<Customer> DiaplayAll();
	public Customer getCustomerById(String customerid);

}
