package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;



@RestController
public class UserController
{
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@RequestMapping("/movies/{userId}")
	public List getAllmoviesByuserId(@PathVariable int userId) throws UserNotFoundException
	{
		User u=userService.findUserById(userId);
		if(u==null)
		{
			throw new UserNotFoundException("Unotherized User ");//return null;
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
	
	@PutMapping("/movies/{userId}")
	public Object update(@PathVariable int userId, @RequestBody Object object)
	{
		User u=userService.findUserById(userId);
		if(u==null)
		{
			throw new UserNotFoundException("Unotherized User ");//return null;
		}
		else
		{
		return userService.update(userId, object);
		}
	}
	@DeleteMapping("/movies/{userId}/{id}")
	public Object del(@PathVariable("userId") Integer userId,@PathVariable("id") Integer id)
	{
		User u=userService.findUserById(userId);
		if(u==null)
		{
			throw new UserNotFoundException("Unotherized User ");//return null;
		}
		else
		{	
		return userService.delete(userId, id);
		}
	}
	@PostMapping("/movies/{userId}")
	public Object save(@PathVariable("userId") Integer userId,@RequestBody Object object)
	{
		User u=userService.findUserById(userId);
		if(u==null)
		{
			throw new UserNotFoundException("Unotherized User ");//return null;
		}
		else
		{
		return userService.save(userId, object);
		}
	}
	
}
	



