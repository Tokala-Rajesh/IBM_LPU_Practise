package com.example.demo.dao;

import java.util.List;

import com.example.demo.data.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getEmployees();

	public Employee createEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public void updateEmployee(Employee employee);
	public void DeleteEmployee(int id);
	
}
