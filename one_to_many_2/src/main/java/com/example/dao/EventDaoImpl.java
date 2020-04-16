package com.example.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Event;
@Repository
public class EventDaoImpl implements EventDao
{
	@Autowired
	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	
//	@Autowired
//	public EventDaoImpl(SessionFactory sessionFactory) {
//		super();
//		this.sessionFactory = sessionFactory;
//	}
	@PostConstruct
	public void init()
	{
		factory=sessionFactory.unwrap(SessionFactory.class);
		entityManager=factory.createEntityManager();
	}

	public Event CreateEvent(Event event) 
	{ 
		entityManager.getTransaction().begin();
		entityManager.persist(event);
		entityManager.getTransaction().commit();	
		return event;
	}
	

}
