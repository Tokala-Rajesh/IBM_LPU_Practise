package com.example.dao;

import java.util.List;

import com.example.model.ToDo;

public interface ToDoDao
{
		
		public void createTask(ToDo todo);
		public List<ToDo> getAllToDo();

	

}
