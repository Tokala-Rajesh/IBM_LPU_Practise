package com.example.demo.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.data.Employee;

@Repository(value = "employeeDAO")
@EnableTransactionManagement
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	//@Transactional
	public List<Employee> getEmployees() {
		
		//Session session = entityManager.unwrap(Session.class);
		TypedQuery query = entityManager.createQuery("from Employee",Employee.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		//Session session = entityManager.unwrap(Session.class);
		//session.save(employee);
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int id)
	{
		// TODO Auto-generated method stub
		return entityManager.find(Employee.class, id);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee)
	{
		entityManager.merge(employee);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void DeleteEmployee(int id) 
	{
		entityManager.remove(entityManager.find(Employee.class, id));

		// TODO Auto-generated method stub
		
	}

}
