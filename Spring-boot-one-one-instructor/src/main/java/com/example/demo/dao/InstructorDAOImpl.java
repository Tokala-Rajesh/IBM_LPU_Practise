package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Instructor;

@Repository("instructorDAO")
@EnableTransactionManagement
public class InstructorDAOImpl implements InstructorDAO{
	
	@Autowired
	private EntityManager entityManager;	
	
	@Override
	@Transactional
	public void createInstructor(Instructor instructor) 
	{
		
		 entityManager.persist(instructor);
	}

	@Override
	public List<Instructor> getAllInstructorswithDetails() {
		List<Instructor> instr =  entityManager.createQuery("from Instructor",Instructor.class).getResultList();
		return instr;
	
	}

	@Override
	@Transactional
	public Instructor getInstructorById(int id)
	{
		
		// TODO Auto-generated method stub
		return  entityManager.find(Instructor.class, id);
	}

	@Override
	@Transactional
	public void deleteInstructorbyId(int id)
	{
		//Instructor inst=entityManager.find(Instructor.class, id);
		 entityManager.remove(entityManager.find(Instructor.class, id));
		// TODO Auto-generated method stub
		 
		
	}

	@Override
	@Transactional
	public void updateInstructor(Instructor instructor)
	{
		 entityManager.merge(instructor);
		
	}



	
	
	
	
	
	
	
	
	
}
