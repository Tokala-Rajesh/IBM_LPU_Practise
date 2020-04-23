package com.example.demo.rest;

public class InstructorNotFoundException extends RuntimeException //extends Throwable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7853318167277648237L;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public InstructorNotFoundException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "CustomerNotFoundException [message=" + message + "]";
	}
	

}
