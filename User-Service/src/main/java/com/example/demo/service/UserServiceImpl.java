package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
@Service
public class UserServiceImpl implements UserService
{
	
	private RestTemplate restTemplate;
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(RestTemplate restTemplate, UserDao userDao) {
		super();
		this.restTemplate = restTemplate;
		this.userDao = userDao;
	}

	@Override
	public List getAllMovies() //int userId
	{
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://movie-service/movies", List.class);
	}

	@Override
	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.findById(userId).get();
	}

	@Override
	public List getAllmoviesByuserId(int userId) 
	{
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://movie-service/movies", List.class);
	}

}
