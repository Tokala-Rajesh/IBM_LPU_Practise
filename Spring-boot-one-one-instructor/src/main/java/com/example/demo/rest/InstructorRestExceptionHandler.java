package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class InstructorRestExceptionHandler 
{
	@ExceptionHandler
	public ResponseEntity<InstructorErrorResponse> handleException(InstructorNotFoundException exc)
	{
	
		InstructorErrorResponse error = new InstructorErrorResponse(HttpStatus.NOT_FOUND.value(),exc.getMessage(),System.currentTimeMillis());
		return new ResponseEntity<InstructorErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<InstructorErrorResponse> handleException(Exception exc)
	{
		InstructorErrorResponse error = new InstructorErrorResponse(HttpStatus.BAD_REQUEST.value(),	exc.getMessage(),System.currentTimeMillis());
		return new ResponseEntity<InstructorErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}

}
