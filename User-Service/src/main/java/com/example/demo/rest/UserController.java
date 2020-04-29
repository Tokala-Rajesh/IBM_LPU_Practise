package com.example.demo.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import com.example.exception.UserNotFounException;
import com.example.exception.UserResponseEntity;

@RestController
public class UserController
{
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@RequestMapping("/movies/{userId}")
	public List getAllmoviesByuserId(@PathVariable int userId) throws UserNotFounException
	{
		User u=userService.findUserById(userId);
		if(u==null)
		{
			throw new UserNotFounException("Unotherized User ");//return null;
		}
		else
		{	
		return userService.getAllmoviesByuserId(userId);
		}
	}
	@RequestMapping("/movies")
	public List getAll()
    {
		
		return userService.getAllMovies();
	 }
	@RequestMapping("/users/{userId}")
	public User getbyId(@PathVariable int userId)
	{
		return userService.findUserById(userId);
	}
	@ExceptionHandler
	public ResponseEntity<UserResponseEntity> handleException(UserNotFounException exe)
	{
		return new ResponseEntity<UserResponseEntity>(new UserResponseEntity(HttpStatus.NOT_FOUND.value(),exe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
		
		 
	}
	@ExceptionHandler
	public ResponseEntity<UserResponseEntity> handleNumberFormatException(NumberFormatException ipme)
	{
		return new ResponseEntity<UserResponseEntity>(new UserResponseEntity(HttpStatus.BAD_REQUEST.value(),"must provide numeric value", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
	}
}
	



