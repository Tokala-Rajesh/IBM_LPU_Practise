package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Project;
import com.example.entity.Student;

public class Deletewithproject
{
	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Project.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();

			int id = 2;
			Project tempProject=session.get(Project.class, id);
			System.out.println("tempProject: " + tempProject);
			System.out.println("the associated instructor: " + tempProject.getStudent());
			System.out.println("Deleting tempProject: " + tempProject);
			session.delete(tempProject);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			
			session.close();
			
			factory.close();
		}
	}

}
