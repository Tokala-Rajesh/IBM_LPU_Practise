package com.example.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Order;
@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager e;

	@PostConstruct
	public void init()
	{
		factory = sessionFactory.unwrap(SessionFactory.class);
		e = factory.createEntityManager();
	}
	public Order addOrder(Order order) 
	{
		Order obj = e.find(Order.class,order.getId());
		if(obj == null)
		{
			e.getTransaction().begin();
			e.persist(order);
			e.getTransaction().commit();
			return order;
		}
		else
		{
			e.getTransaction().begin();
			e.merge(order);
			e.getTransaction().commit();
			return order;
		}
		
		
	}
     public  Order getOrder(int id) {
		
    	 Order obj = e.find( Order.class,id);
		if(obj == null)
		{
			System.out.println("No data with id: " + id);
			return null;
		}
		else
			return obj;
	}
     
     public List<Order> getAllOrders() {
 		List<Order> list = e.createQuery("from Order", Order.class).getResultList();
 		if(list.isEmpty())
 		{
 			System.out.println("No data is Available...");
 			return null;
 		}

 		else
 			return list;
 	}

}
