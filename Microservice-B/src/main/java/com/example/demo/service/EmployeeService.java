package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Employee;

public interface EmployeeService
{
	public Iterable<Employee> findByDepartmentName(String departmentName);
	public Employee saveEmployee(Employee employee);

}
