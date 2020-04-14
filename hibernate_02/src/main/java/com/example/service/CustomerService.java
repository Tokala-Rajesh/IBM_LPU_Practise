package com.example.service;

import java.util.List;

import com.example.model.Customer;

public interface CustomerService
{
	public Customer createCustomer(Customer customer);
	public List<Customer> DiaplayAll();
	public Customer getCustomerById(String customerid);

}
