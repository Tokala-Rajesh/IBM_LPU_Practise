package com.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory
{
	private static Connection connection;
	private static MyConnectionFactory factory;
	
	private MyConnectionFactory()
	{
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajeshdb", "root", "rajesh1@");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public  Connection getMyConnection() throws SQLException {
		return connection;
	}
	public static MyConnectionFactory getConnectionObject() {
		if (factory == null) {
			factory = new MyConnectionFactory();
		}
		return factory;
	}

}
