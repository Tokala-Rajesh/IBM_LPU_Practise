package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.factory.MyHibernateFactory;
import com.example.model.Customer;

public class CustomerDaoImpl implements CustomerDao 
{
	private  MyHibernateFactory factory=null;
	private SessionFactory sessionFactory=null;
	private Session session=null;
	
	{
		factory=MyHibernateFactory.getMyHibernateFactory();
		sessionFactory=factory.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Customer createCustomer(Customer customer) 
	{
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		// TODO Auto-generated method stub
		return customer;
	}

	public List<Customer> DiaplayAll()
	{
		List<Customer> list=session.createQuery("from Customer",Customer.class).list();
		// TODO Auto-generated method stub
		return list;
	}

	public Customer getCustomerById(String customerid) {
		// TODO Auto-generated method stub
		return session.get(Customer.class, customerid);
	}

}
