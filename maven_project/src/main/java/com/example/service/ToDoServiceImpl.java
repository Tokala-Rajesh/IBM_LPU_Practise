package com.example.service;

import java.util.List;

import com.example.dao.ToDoDao;
import com.example.dao.ToDoDaoImpl;
import com.example.model.ToDo;


public class ToDoServiceImpl implements ToDoService 
{
private ToDoDao dao;
	
	{
		dao=new ToDoDaoImpl();
	}

	public void createTask(ToDo todo) {
		dao.createTask(todo);
		// TODO Auto-generated method stub
		
	}

	public List<ToDo> getAllToDo() {
		// TODO Auto-generated method stub
		return dao.getAllToDo();
		
	}
	
}



