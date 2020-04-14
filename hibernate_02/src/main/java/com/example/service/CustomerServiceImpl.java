package com.example.service;

import java.util.List;

import com.example.dao.CustomerDao;
import com.example.dao.CustomerDaoImpl;
import com.example.model.Customer;

public class CustomerServiceImpl implements CustomerService 
{
	private CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}

	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	public List<Customer> DiaplayAll() {
		// TODO Auto-generated method stub
		return dao.DiaplayAll();
	}

	public Customer getCustomerById(String customerid) {
		// TODO Auto-generated method stub
		return dao.getCustomerById(customerid);
	}

}
