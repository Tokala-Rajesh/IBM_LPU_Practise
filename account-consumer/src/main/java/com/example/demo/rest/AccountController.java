package com.example.demo.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@Api(value="Account Management System", description="Operations pertaining to employee in Employee Management System")
public class AccountController
{
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	@ApiOperation(value = "View a list of available employees", response = List.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/accounts")
	public Iterable<Account> getAll()
	{
		return accountService.getAll();
	}
	@ApiOperation(value = "Get an account by Id")
	@GetMapping("/accounts/{id}")
	public ResponseEntity<Account> getById(@ApiParam(value = "Account id from which account object will retrieve", required = true) @PathVariable int id)
	{
		Account account=accountService.getById(id);
		if(account==null)
		{
			return null;
		}
		else
		{
			return new ResponseEntity<Account>(account, HttpStatus.OK);
		}
	}
	@ApiOperation(value = "Update an account")
	@PutMapping("/accounts")
	public ResponseEntity<Account> update(@ApiParam(value = "Account Id to update account object", required = true) @RequestBody Account account)
	{
		Account ac=accountService.update(account);
		if(ac==null)
		{
			return null;
		}
		else
		{
			return new ResponseEntity<Account>(ac, HttpStatus.OK);
		}
	}
	@ApiOperation(value = "Update an account")
	@DeleteMapping("/accounts/{id}")
	public void delete(@ApiParam(value = "Account Id from which account object will delete from database table", required = true)@PathVariable int id)
	{
		Account ac=accountService.getById(id);
		if(ac==null)
		{
			return;
		}
		else
		{
		  accountService.delete(id);
		}
	}
	
	

	

}
