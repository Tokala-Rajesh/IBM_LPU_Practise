package com.example.demo.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;

@Component
public class EmployeeFallBack implements EmployeeClient {

	@Override
	public String callHi(String name) 
	{
		
		// TODO Auto-generated method stub
	   return "<p>service is currently not available come back later<p>";
	}

	@Override
	public ResponseEntity<Iterable<Employee>> getByDepartmentName(String departmentName) 
	{
		// TODO Auto-generated method stub
		return new ResponseEntity("service is currently unavailable", HttpStatus.SERVICE_UNAVAILABLE);
	}

	@Override
	public ResponseEntity<Employee> addEmployye(Employee employee) {
		// TODO Auto-generated method stub
		return new ResponseEntity("service is currently unavailable", HttpStatus.SERVICE_UNAVAILABLE);
	}

}
