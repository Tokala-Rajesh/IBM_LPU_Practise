package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovieExceptionHandler 
{
	@ExceptionHandler
	public ResponseEntity<MovieResponseEntity> handlesExeption(UserNotFoundException exe) 
	{
		return new ResponseEntity<MovieResponseEntity>(new MovieResponseEntity(HttpStatus.FORBIDDEN.value(),
				exe.getMessage(), System.currentTimeMillis()), HttpStatus.FORBIDDEN);

	}

}
