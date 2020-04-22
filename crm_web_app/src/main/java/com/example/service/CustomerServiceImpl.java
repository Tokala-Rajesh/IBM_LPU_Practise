package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.entity.Customer;
import com.example.exception.CustomerNotFoundException;
@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerDao customerdao;

	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerdao.getCustomers();
	}
	@Transactional
	public Customer getCustomerbyId(Integer id) //throws CustomerNotFoundException 
	{
		// TODO Auto-generated method stub
		return customerdao.getCustomerbyId(id);
	}
	public void AddCustomer(Customer customer) 
	{
		customerdao.AddCustomer(customer);
		// TODO Auto-generated method stub
		
	}
	
	public void UpdateById(Customer customer) 
	{
		customerdao.UpdateById(customer);
		// TODO Auto-generated method stub
		
	}
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerdao.deleteCustomer(id);
	}

}
