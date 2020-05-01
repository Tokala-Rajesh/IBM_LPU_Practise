package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>
{
	public Iterable<Employee> findByDepartmentName(String departmentName);

}
