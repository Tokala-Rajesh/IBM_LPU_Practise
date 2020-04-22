package com.example.exception;

public class CustomerNotFoundException extends RuntimeException //extends Throwable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6910162929775087239L;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public CustomerNotFoundException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "CustomerNotFoundException [message=" + message + "]";
	}
	

}
