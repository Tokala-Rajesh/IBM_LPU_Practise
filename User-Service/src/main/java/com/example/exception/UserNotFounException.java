package com.example.exception;

public class UserNotFounException extends Throwable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5740458387806863859L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserNotFounException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserNotFounException [message=" + message + "]";
	}
	

}
