package com.example.demo;

import java.util.List;
import java.util.Scanner;

import com.example.model.ToDo;
import com.example.service.ToDoService;
import com.example.service.ToDoServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private ToDoService service;
	private static Scanner scanner = new Scanner(System.in);

	{
		service = new ToDoServiceImpl();
	}
    public static void main( String[] args )
    {
    	int choice = 0;
		App app=new App();

		do {
			System.out.println("1. Create a Task.");
			System.out.println("2. Display All Tasks.");
			System.out.println("3. Delete a task");
			System.out.println("4. Update a task");
			System.out.print("choose your choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter ToDO Name: ");
				app.service.createTask(new ToDo(scanner.next()));
				break;
			case 2:
				List<ToDo> list=app.service.getAllToDo();
				for(ToDo todo:list)
				{
					System.out.println(todo);
				}
				break;
			case 0:
				System.out.println("bye");
				System.exit(0);
				break;
			default:
				break;
			}

		} while (choice != 0);

    }
}
