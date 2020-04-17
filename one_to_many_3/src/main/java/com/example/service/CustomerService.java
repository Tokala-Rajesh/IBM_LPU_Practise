package com.example.service;

import com.example.entity.Customer;

public interface CustomerService
{
	public Customer addCustomer(Customer customer);
	public Customer getCustomer(int id);

}
