package com.example.demo.rest;

import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.exception.ResourceNotFoundException;

@RestController
public class UserController
{
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@RequestMapping("/movies/{userId}")
	public List getAllmoviesByuserId(@PathVariable int userId) throws ResourceNotFoundException
	{
		com.example.demo.entity.User u=userService.findUserById(userId);
		if(u==null)
		{
			throw new ResourceNotFoundException("No employee found with id = "+userId);//return null;
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
}
	



