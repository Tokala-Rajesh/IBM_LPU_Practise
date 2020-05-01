package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao employeeDao;
	

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public Iterable<Employee> findByDepartmentName(String departmentName) 
	{
		// TODO Auto-generated method stub
		return employeeDao.findByDepartmentName(departmentName);
	}


	@Override
	public Employee saveEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

}
