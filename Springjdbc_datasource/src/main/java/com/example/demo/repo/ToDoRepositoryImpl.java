package com.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.ToDo;


@Repository
public class ToDoRepositoryImpl implements ToDoRepository 
{
	private static Logger logger=Logger.getLogger("ToDoRepositoryImpl");
	private DataSource datasource;
	private Connection connect=null;
	
    @Autowired
	public ToDoRepositoryImpl(DataSource datasource) {
		super();
		logger.log(Level.INFO, "connecting to DB");
		try {
			connect=datasource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.log(Level.INFO, "connected to DB");
		this.datasource = datasource;
	}
    
    


	public ToDo createtodo(ToDo todo) 
	{
		try
		{
			
			PreparedStatement pStatement=connect.prepareStatement("insert into todo value(?,?)");
			pStatement.setString(1, todo.getTodoId());
			pStatement.setString(2, todo.getTodoName());
			pStatement.executeUpdate();
			logger.log(Level.INFO, "todo creation is completed");
		}
		catch(Exception e)
		{
			logger.log(Level.INFO, "unable to connect to DB");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return todo;
	}




	public List<ToDo> DisplayAllTodos() {
		ResultSet rs;
		try {
			connect=datasource.getConnection();
		PreparedStatement psDisplay=connect.prepareStatement("select * from todo");
		rs=psDisplay.executeQuery();
		List<ToDo> listTodos = new ArrayList<ToDo>();
		while (rs.next()) 
		{
			listTodos.add(new ToDo(rs.getString(1), rs.getString(2)));
		}
		return listTodos;
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
