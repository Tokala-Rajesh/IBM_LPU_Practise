package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TodoDao;
import com.example.demo.model.Todo;

@RestController 
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class TodoController 
{
	private TodoDao todoDao;

	public TodoController(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}
	 @PostMapping("/todos")
	 public Todo createTodos(@Valid @RequestBody Todo todo) 
	 {
	        return todoDao.saveTodos(todo);
	  }
	 @GetMapping("/todos")
	    public List<Todo> getAllTodos() 
	 {
	        return todoDao.listall();
	    }
	 
	 @GetMapping("/todos/{id}")
	 public Todo getById(@PathVariable(value = "id") Long id)
	 {
		 return todoDao.getById(id);
	 }
	 @PutMapping("/todos/{id}")
	 public ResponseEntity<Todo> updateEmployee(@PathVariable(value = "id") Long id, @Valid @RequestBody Todo todo)
	 {
		 Todo todos=todoDao.getById(id);
		 todos.setTodoName(todo.getTodoName());
		 todos.setTodoDesc(todo.getTodoDesc());
		 final Todo updateTodo=todoDao.updateByid(todos);
		 return ResponseEntity.ok(updateTodo);
	 }
	 @DeleteMapping("/todos/{id}")
	    public Todo deleteTodo(@PathVariable(value = "id") Long id)
	     {
		 Todo todo=todoDao.deleteByid(id);
		  if(todo==null)
		  {
			  return null;
		  }
			  return todo;
//	        Map<String, Boolean> response = new HashMap<>();
//	        response.put("deleted", Boolean.TRUE);
//	        return response;
	    }

}
