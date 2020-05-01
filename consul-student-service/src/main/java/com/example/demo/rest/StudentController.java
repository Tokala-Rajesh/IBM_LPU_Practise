package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController 
{
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	 
	@GetMapping("/students/{schoolName}")
	public Iterable<Student> findStudentBySchoolName(@PathVariable String schoolName) {
		Iterable<Student>students = studentService.findBySchool(schoolName);
		if(students==null)
			return null;
		else
			return students;
	}

}
