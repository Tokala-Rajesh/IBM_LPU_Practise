package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.exception.CustomerNotFoundException;
import com.example.exception.CustomerResponseEntity;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController 
{
	@Autowired
	private CustomerService customerService;
	List<Customer> customer=null;
	@GetMapping("/customers")
	public List<Customer> getCustomers() 
	{
		
		return customerService.getCustomers();
	}
	@GetMapping("/customers/{id}")
	public Customer getCustomerbyId(@PathVariable Integer id) //throws CustomerNotFoundException
	{	
		Customer customer=customerService.getCustomerbyId(id);
		if (customer == null) {
		throw new CustomerNotFoundException("Customer id not found - " + id);
	}
		return customer ;
	}
//	@ExceptionHandler
//	public ResponseEntity<CustomerResponseEntity> handleException(CustomerNotFoundException exe)
//	{
//		return new ResponseEntity<CustomerResponseEntity>(new CustomerResponseEntity(HttpStatus.NOT_FOUND.value(),exe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
//		 
//	}
//	@ExceptionHandler
//	public ResponseEntity<CustomerResponseEntity> handleNumberFormatException(NumberFormatException ipme)
//	{
//		return new ResponseEntity<CustomerResponseEntity>(new CustomerResponseEntity(HttpStatus.BAD_REQUEST.value(),"you must provide numeric value", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
//	}
	@PostMapping("/customers")
	public void AddCustomer(@RequestBody Customer customer)
	{
		customerService.AddCustomer(customer);
		
	}
	@PutMapping("/customers")
	public void UpdateById(@RequestBody Customer customer) 
	{
		customerService.UpdateById(customer);
		
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id) //throws CustomerNotFoundException
	{
		Customer customer=customerService.getCustomerbyId(id);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer id not found - " + id);
		}
		customerService.deleteCustomer(id);
		
	}
		

}
