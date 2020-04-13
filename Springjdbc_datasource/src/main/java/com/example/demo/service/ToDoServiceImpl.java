package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;
@Service
public class ToDoServiceImpl implements ToDoService 
{
	private ToDoRepository toDoRepository;
	

	@Autowired
	public ToDoServiceImpl(ToDoRepository toDoRepository) {
		super();
		this.toDoRepository = toDoRepository;
	}


	public ToDo createtodo(ToDo todo) {
		// TODO Auto-generated method stub
		return toDoRepository.createtodo(todo);
	}


	public List<ToDo> DisplayAlltodos() {
		// TODO Auto-generated method stub
		return toDoRepository.DisplayAllTodos();
	}

}
