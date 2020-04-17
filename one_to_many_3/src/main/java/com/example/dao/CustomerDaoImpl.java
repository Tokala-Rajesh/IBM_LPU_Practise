package com.example.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager e;

	@PostConstruct
	public void init()
	{
		factory = sessionFactory.unwrap(SessionFactory.class);
		e= factory.createEntityManager();
	}
	public Customer addCustomer(Customer customer) 
	{
		
		Customer obj = e.find(Customer.class,customer.getId());
		if(obj == null)
		{
			e.getTransaction().begin();
			e.persist(customer);
			e.getTransaction().commit();
			return customer;
		}
		else
		{
			e.getTransaction().begin();
			e.merge(customer);
			e.getTransaction().commit();
			return customer;
		}
	}
	public Customer getCustomer(int id)
	{
		Customer obj = e.find(Customer.class,id);
		if(obj == null)
		{
			System.out.println("No data with id: " + id);
			return null;
		}
		else
			return obj;
		// TODO Auto-generated method stub
		
	}

}
