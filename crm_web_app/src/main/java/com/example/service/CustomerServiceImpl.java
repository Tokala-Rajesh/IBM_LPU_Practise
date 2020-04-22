package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.entity.Customer;
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

}
