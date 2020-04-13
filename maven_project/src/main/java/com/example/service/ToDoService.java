package com.example.service;

import java.util.List;

import com.example.model.ToDo;

public interface ToDoService {
	public void createTask(ToDo todo);
	public List<ToDo> getAllToDo();

}
