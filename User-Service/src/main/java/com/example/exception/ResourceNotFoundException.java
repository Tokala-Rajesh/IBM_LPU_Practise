package com.example.exception;

public class ResourceNotFoundException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8219378476262189725L;
	
	public ResourceNotFoundException(String message)
	{
    	super(message);
	}

}
