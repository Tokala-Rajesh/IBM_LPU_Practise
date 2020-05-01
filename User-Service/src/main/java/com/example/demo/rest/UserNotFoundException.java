package com.example.demo.rest;

public class UserNotFoundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7184934977488256067L;
	private String message;

	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
