package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Todo;

public interface TodoDao 
{
	public Todo saveTodos(Todo todo);
	public List<Todo> listall(); 
	public Todo getById(Long id);
	public Todo updateByid(Todo todo);
	public Todo deleteByid(Long id);

}
