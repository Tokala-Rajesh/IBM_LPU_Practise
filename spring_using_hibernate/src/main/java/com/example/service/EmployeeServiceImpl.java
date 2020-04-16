package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;
import com.example.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	
	private EmployeeDao dao;
	
	
	public EmployeeDao getDao() {
		return dao;
	}
    @Autowired
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public Employee createEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		return dao.createEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}
	public void removeEmployee(int id)
	{
		dao.removeEmployee(id);
		// TODO Auto-generated method stub
		
	}
	public Employee raiseEmployeeSalary(int id, int raise) {
		// TODO Auto-generated method stub
		return dao.raiseEmployeeSalary(id, raise);
	}
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.findEmployee(id);
	}
	public Collection<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAllEmployees();
	}

}
