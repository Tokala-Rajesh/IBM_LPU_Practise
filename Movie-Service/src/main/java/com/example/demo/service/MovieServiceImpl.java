package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MovieDao;
import com.example.demo.entity.Movie;
@Service
public class MovieServiceImpl implements MovieService
{
	private MovieDao movieDao;
	
    @Autowired
	public MovieServiceImpl(MovieDao movieDao) 
    {
		super();
		this.movieDao = movieDao;
	}


	@Override
	public List<Movie> getAllMoviesList() 
	{
		// TODO Auto-generated method stub
		return (List<Movie>) movieDao.findAll();
	}

}
