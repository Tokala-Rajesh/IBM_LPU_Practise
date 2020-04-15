package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Project;
import com.example.entity.Student;

public class Create 
{
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Project.class).buildSessionFactory();
		Session session = factory.openSession();
		try {			
			Student tempStudent=new Student("Rajesh", "Tokala", "rajesh@gmail.com");
			Project tempProject=new Project(1,"StudentManagement");			
			tempStudent.setProject(tempProject);	
			session.beginTransaction();
			System.out.println("Student details " + tempStudent);
			session.save(tempStudent);					
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}
