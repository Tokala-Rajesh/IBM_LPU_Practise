package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;

@RestController
public class MovieRestController
{
	private MovieService movieService;
    @Autowired
	public MovieRestController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
    
    @RequestMapping("/movies")
	public List<Movie> getAll()
	{
		return movieService.getAllMoviesList();
	}
	

}
