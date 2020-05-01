package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;

@FeignClient(value="service-B", fallback = EmployeeFallBack.class)
public interface EmployeeClient 
{
	@RequestMapping("/api/employees/hi")
	public String callHi(@RequestParam String name);
	@RequestMapping("/api/employees/{departmentName}")
	public ResponseEntity<Iterable<Employee>> getByDepartmentName(@PathVariable String departmentName);
	@PostMapping("/api/employees")
    public ResponseEntity<Employee> addEmployye(@RequestBody Employee employee);


}
