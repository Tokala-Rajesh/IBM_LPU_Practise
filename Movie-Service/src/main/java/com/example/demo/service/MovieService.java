package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Movie;

public interface MovieService
{
	public List<Movie> getAllMoviesList();
	public Movie addMovies(Movie movie);
	public Movie updateMovie(Movie movie);
	public void deleteMovie(int id);

}
