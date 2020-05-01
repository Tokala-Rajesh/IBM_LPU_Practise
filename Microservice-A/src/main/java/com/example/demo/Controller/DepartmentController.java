package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.EmployeeClient;
import com.example.demo.model.Employee;


@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class DepartmentController 
{
	private EmployeeClient employeeclient;
	@Autowired
	public DepartmentController(EmployeeClient employeeclient) {
	
		this.employeeclient = employeeclient;
	}

	@RequestMapping("/departments/hello")
	public ResponseEntity<String> sayHello(@RequestParam String name)
	{
		String result=employeeclient.callHi(name);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@RequestMapping("/employees/department/{departmentName}")
	public ResponseEntity<Iterable<Employee>> findByDepartmentName(@PathVariable String departmentName)
	{
			return employeeclient.getByDepartmentName(departmentName);
		
	}
	@PostMapping("/employees/add")
	public ResponseEntity<Employee> addEmployye(@RequestBody Employee employee)
	{
		return employeeclient.addEmployye(employee);
	}

}
