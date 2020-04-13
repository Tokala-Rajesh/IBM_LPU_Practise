package com.example.demo.repo;

import java.util.List;

import com.example.demo.bean.ToDo;

public interface ToDoRepository 
{
	public ToDo createtodo(ToDo todo);
	public List<ToDo> DisplayAllTodos();
	

}
