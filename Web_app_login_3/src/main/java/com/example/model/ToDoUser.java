package com.example.model;

public class ToDoUser 
{
	private String userId;
	private String password;
	public ToDoUser(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public ToDoUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
