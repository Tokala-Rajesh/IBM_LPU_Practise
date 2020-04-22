package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;
import com.example.exception.CustomerNotFoundException;
@Repository
public class CustomerDaoImpl implements CustomerDao
{
	@Autowired
	private SessionFactory sessionFactory;
	List<Customer> customers=null;

	public List<Customer> getCustomers() 
	{
		Session currentSession = sessionFactory.openSession();
		Query<Customer> query = currentSession.createQuery("from Customer order by lastName",Customer.class);
		customers = query.getResultList();
		return customers;
	}

	public Customer getCustomerbyId(Integer id)// throws CustomerNotFoundException
	{
		Session currentSession = sessionFactory.openSession();
		Customer customer= currentSession.get(Customer.class, id);
//		if(customer==null)
//		{
//			throw new CustomerNotFoundException("No Customer found with the id: " + id);
//		}
		return customer;
	}

	public void AddCustomer(Customer customer)
	{
		Session currentSession = sessionFactory.openSession();
		currentSession.save(customer);
		// TODO Auto-generated method stub
		
	}
  //  @Transactional
	public void UpdateById(Customer customer) 
	{
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		currentSession.saveOrUpdate(customer);
		currentSession.getTransaction().commit();
		// TODO Auto-generated method stu
		
	}

	public void deleteCustomer(int id)
	{
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		Query query = currentSession.createQuery("delete from Customer where id=:id");//:id is the id of customer
		query.setParameter("id", id);//here "id" is the id given in the customer class
		query.executeUpdate();		
		currentSession.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}
}


