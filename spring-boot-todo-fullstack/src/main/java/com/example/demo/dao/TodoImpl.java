package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Todo;

@Repository
@EnableTransactionManagement
public class TodoImpl implements TodoDao 
{
	private EntityManager em;
	
    @Autowired
	public TodoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	@Transactional
	public Todo saveTodos(Todo todo)
	{
		 em.persist(todo);
		return todo;
	}

	@Override
	public List<Todo> listall() {
		// TODO Auto-generated method stub
		TypedQuery query = em.createQuery("from Todo",Todo.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Todo getById(Long id)
	{
		
		// TODO Auto-generated method stub
		return em.find(Todo.class, id);
	}

	@Override
	@Transactional
	public Todo updateByid(Todo todo) {
		// TODO Auto-generated method stub
		return em.merge(todo);
	}

	@Override
	@Transactional
	public Todo deleteByid(Long id)
	{
		Todo todo=em.find(Todo.class, id);
		em.remove(todo);
		return todo;
		
	}

}
