package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class ToDo 
{
	private String todoId;
	private String todoName;
	
	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ToDo(String todoId, String todoName) {
		super();
		this.todoId = todoId;
		this.todoName = todoName;
	}

	public String getTodoId() {
		return todoId;
	}
	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}
	public String getTodoName() {
		return todoName;
	}
	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	@Override
	public String toString() {
		return "ToDo [todoId=" + todoId + ", todoName=" + todoName + "]";
	}
	

}
