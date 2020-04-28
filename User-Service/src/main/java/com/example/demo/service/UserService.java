package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.User;

public interface UserService 
{
	public List getAllMovies(); //int userId
	public User findUserById(int userId);
	public List getAllmoviesByuserId(int userId);

}
