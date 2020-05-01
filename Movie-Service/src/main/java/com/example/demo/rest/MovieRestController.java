package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PutMapping("/movies")
	public Movie update(@RequestBody Movie movie)
	{
		return movieService.updateMovie(movie);
	}
	@DeleteMapping("/movies/{id}")
	public void del(@PathVariable("id") Integer id)
	{
		movieService.deleteMovie(id);
		
	}
	@PostMapping("/movies")
	public Movie save(@RequestBody Movie movie)
	{
		return movieService.addMovies(movie);
	}	

}
