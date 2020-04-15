package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Course;
import com.example.entity.Instructor;

public class CreateCourseDemo 
{
	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
			int id = 1;
			Instructor tempInstructor = session.get(Instructor.class, id);		
			Course tempCourse1 = new Course("JAVA");
			Course tempCourse2 = new Course("FRONTEND");
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);
			session.save(tempCourse1);
			session.save(tempCourse2);
			session.getTransaction().commit();
			System.out.println("successfully saved the courses");
		}
		finally {
			
			session.close();
			factory.close();
		}
	}

}
