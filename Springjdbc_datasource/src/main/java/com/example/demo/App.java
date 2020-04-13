package com.example.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.ToDo;
import com.example.demo.repo.ToDoRepository;
import com.example.demo.repo.ToDoRepositoryImpl;
import com.example.demo.service.ToDoService;
import com.example.demo.service.ToDoServiceImpl;


/**
 * Hello world
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ToDoRepository toDoRepository=context.getBean("toDoRepositoryImpl",ToDoRepositoryImpl.class); 
//		ToDo todo=toDoRepository.createtodo(new ToDo(UUID.randomUUID().toString(), "Debug"));
//		System.out.println(todo);
    	ToDoService service=context.getBean("toDoServiceImpl",ToDoServiceImpl.class);
		ToDo todo=context.getBean("toDo",ToDo.class);
		todo.setTodoId(UUID.randomUUID().toString());
		todo.setTodoName("testing");
		todo=service.createtodo(todo);
		System.out.println(todo);
		List<ToDo> listTodos = service.DisplayAlltodos();
		for(ToDo todos:listTodos) {
			System.out.println(todos);
		}
    }
}
