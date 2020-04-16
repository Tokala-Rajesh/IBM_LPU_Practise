package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.util.Collection;

import javax.annotation.PostConstruct;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao
{

	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	

	

	@Autowired
	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	@PostConstruct
	public void init()
	{
		factory=sessionFactory.unwrap(SessionFactory.class);
		entityManager=factory.createEntityManager();
	}

	public Employee createEmployee(Employee employee)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		return employee;
	}

	public void updateEmployee(Employee employee)
	{
		
		// TODO Auto-generated method stub

	}
	public void removeEmployee(int id)
	{
		Employee employee = findEmployee(id);
		if (employee == null)
		{
			System.out.println("we are not able to delete because no id is found");
		} 
		else
		{
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			System.out.println("employee deleted successfully." + employee);
		}

		// TODO Auto-generated method stub
		
	}
	public Employee raiseEmployeeSalary(int id, int raise) 
	{
		Employee employee = findEmployee(id);
		if (employee == null) 
		{
			System.out.println("no record found");
			return null;
		}

		else 
		{
			employee.setSalary(employee.getSalary() + raise);
			entityManager.getTransaction().begin();
			entityManager.merge(employee);
			entityManager.getTransaction().commit();
			return employee;
		}
		// TODO Auto-generated method stub
		
	}
	public Employee findEmployee(int id) 
	{
		Employee employee = entityManager.find(Employee.class, id);
		if (employee == null) 
		{
			System.out.println("no such employee found with id: " + id);
			return null;
		} 
		else
		{
			return employee;
		}
		// TODO Auto-generated method stub
		
	}
	public Collection<Employee> findAllEmployees()
	{
		
		// TODO Auto-generated method stub
		return entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
	
	}

}
