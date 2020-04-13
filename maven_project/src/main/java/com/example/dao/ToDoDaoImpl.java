package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Task;
import com.example.model.ToDo;

public class ToDoDaoImpl implements ToDoDao {
	private Task task;
	
	{
		task=new Task();
	}

	public void createTask(ToDo todo) {
		task.createToDo(todo);

		
	}

	public List<ToDo> getAllToDo() {
		
		return task.getAllToDo();
	}

}
