package com.example.dao;

import com.example.entity.Customer;

public interface CustomerDao 
{
	public Customer addCustomer(Customer customer);
	public Customer getCustomer(int id);

}
