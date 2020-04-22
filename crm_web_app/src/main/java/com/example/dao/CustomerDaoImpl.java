package com.example.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> getCustomers() 
	{
		Session currentSession = sessionFactory.openSession();
		Query<Customer> query = currentSession.createQuery("from Customer",Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
	}

}
