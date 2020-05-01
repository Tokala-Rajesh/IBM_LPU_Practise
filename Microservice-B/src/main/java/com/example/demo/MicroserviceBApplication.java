package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceBApplication implements CommandLineRunner
{
	private EmployeeDao employeeDao;
	

	public MicroserviceBApplication(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Employee e=new Employee("rajesh","rajesh@","IT");
		employeeDao.save(e);
		e=new Employee("rakesh","rajesh@","IT");
		employeeDao.save(e);
		e=new Employee("vanitha","vani@","HR");
		employeeDao.save(e);
		e=new Employee("rajesh","rajesh@","HR");
		employeeDao.save(e);
		
		
		// TODO Auto-generated method stub
		
	}

}
