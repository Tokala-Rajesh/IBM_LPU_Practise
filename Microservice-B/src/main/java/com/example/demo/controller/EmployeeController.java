package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class EmployeeController 
{
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@RequestMapping("/employees/hi")
	public String hi(@RequestParam String name)
	{
		return "hi "+name +" all the best" ;
	}
	@RequestMapping("/employees/{departmentName}")
	public ResponseEntity<Iterable<Employee>> getByDepartmentname(@PathVariable String departmentName)
	{
		return ResponseEntity.ok().body(employeeService.findByDepartmentName(departmentName));
	}
    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployye(@RequestBody Employee employee)
    {
    	return ResponseEntity.ok().body(employeeService.saveEmployee(employee));
    }


}
