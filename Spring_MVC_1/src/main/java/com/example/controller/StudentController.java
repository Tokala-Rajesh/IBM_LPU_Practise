package com.example.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController 
{
//	@RequestMapping("/showForm")
//	public String showForm(Model model)
//	{
//		Student student=new Student();
//		model.addAttribute("student", student);
//		return "student-form";
//	}
//	@RequestMapping("/processForm")
//	public String processForm(@ModelAttribute("student") Student theStudent, Model model)
//	{
//		theStudent.setId(UUID.randomUUID().toString());
//		model.addAttribute("student", theStudent);
//		return "student-conformation";
//		
//		
//	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) 
	{
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("theStudent: " + theStudent.getFirstName()+ " " + theStudent.getLastName());
		return "student-conformation";
	}

}
