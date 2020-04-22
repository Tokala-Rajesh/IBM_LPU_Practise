package com.example.dao;

import java.util.List;

import com.example.entity.Customer;
import com.example.exception.CustomerNotFoundException;

public interface CustomerDao
{
	public List<Customer> getCustomers();
	public Customer getCustomerbyId(Integer id) ;//throws CustomerNotFoundException;
	public void AddCustomer(Customer customer);
	public void UpdateById(Customer customer);
	public void deleteCustomer(int id);
	

}
