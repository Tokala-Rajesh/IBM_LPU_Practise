package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Course;
import com.example.entity.Instructor;

public class CreateInstructorDemo 
{
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			
						
			Instructor tempInstructor = new Instructor("Rajesh", "Tokala", "rajesh@lpu.co.in");
			session.beginTransaction();
			System.out.println("Saving the instructor: " + tempInstructor);
			session.save(tempInstructor);					
			session.getTransaction().commit();
			System.out.println("successfully created instructor");
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
