package com.example.demo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Event;
import com.example.entity.Speaker;
import com.example.service.EventService;
import com.example.service.EventServiceImpl;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int choice=0;
    	Scanner scanner=new Scanner(System.in);
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EventService service=context.getBean("eventServiceImpl",EventServiceImpl.class);
    	SpeakerService service1=context.getBean("speakerServiceImpl",SpeakerServiceImpl.class);
//    	Event e=new Event("BIGBOSS","SHOW");
//    	
//    	Event eve=service.CreateEvent(e);
    	System.out.println("Enter the name");
    	String name = scanner.next();
    	System.out.println("Enter the desc");
    	String desc = scanner.next();
    	Event e=service.CreateEvent(new Event(name,desc));
    	System.out.println(e);

    }
}
