package com.example.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Event;
import com.example.entity.Speaker;
@Repository
public class SpeakerDaoImpl implements SpeakerDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	
//	@Autowired
//	public SpeakerDaoImpl(SessionFactory sessionFactory1)
//	{
//		super();
//		this.sessionFactory1 = sessionFactory1;
//	}
	@PostConstruct
	public void init()
	{
		factory=sessionFactory.unwrap(SessionFactory.class);
		entityManager=factory.createEntityManager();
	}

	public Speaker createSpeaker(Speaker speaker)
	{
		Speaker obj = entityManager.find(Speaker.class,speaker.getId());
		if(obj == null)
		{
			entityManager.getTransaction().begin();
			entityManager.persist(speaker);
			entityManager.getTransaction().commit();
			return speaker;
		}
		else
		{
			entityManager.getTransaction().begin();
			entityManager.merge(speaker);
			entityManager.getTransaction().commit();
			return speaker;
		}
	
	}

	
}
