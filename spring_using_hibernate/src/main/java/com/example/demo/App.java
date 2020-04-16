package com.example.demo;

import java.util.Collection;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int choice=0;
    	Scanner scanner=new Scanner(System.in);
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeService service=context.getBean("employeeServiceImpl",EmployeeServiceImpl.class);
    	do
    	{
    		System.out.println("1. create a employee");
    		System.out.println("2. remove an employee");
    		System.out.println("3. raise the salary of employee");
    		System.out.println("4. find the employee by id");
    		System.out.println("5. findall employee details");
    		choice=scanner.nextInt();
    		switch(choice)
    		{
    		case 1:
    			Employee emp=service.createEmployee(new Employee("Rakesh", 1000000));
    	    	System.out.println("done!"+emp);
    			break;
    		case 2:
    			service.removeEmployee(1);
    			break;
    		case 3:
    			Employee employee = service.raiseEmployeeSalary(2, 1000);
    			if (employee == null) 
    			{
    				System.out.println("raise salary aborted.");
    			} 
    			else 
    			{
    				System.out.println("Updated Employee: " + employee);
    			}
    			break;
    		case 4:
    			System.out.println(service.findEmployee(2));
    			break;
    		case 5:
    			Collection<Employee> collection = service.findAllEmployees();
    			for (Employee e : collection)
    			{
    				System.out.println(e);
    			}
    			break;
    		case 0:
    			System.out.println("bye");
    			System.exit(choice);
    			break;
    		}
    		
    		
    		
    	}while(choice!=0);
    	
    	
    }
}
