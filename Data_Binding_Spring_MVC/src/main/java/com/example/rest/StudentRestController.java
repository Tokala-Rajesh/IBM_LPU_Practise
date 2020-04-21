package com.example.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.exception.StudentNotFounException;
import com.example.exception.StudentResponseEntity;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
	List<Student> students =null;
	@PostConstruct
	public void init()
	{
		students = new ArrayList<Student>();
		students.add(new Student(0,"Rajesh", "Tokala"));
		students.add(new Student(1,"Vanitha", "Tokala"));
		students.add(new Student(2,"Rakesh", "Tokala"));
	}
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student)
	{
		students.add(student);
		return student;
	}
	@GetMapping("/students")
	public List<Student> getStudents() 
	{		
	    return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentByID(@PathVariable int id) throws StudentNotFounException
	{
		
		if(id>=students.size()||(id<0))
		{
			throw new StudentNotFounException("student id nt found:"+ id);
		}
			return students.get(id);	
		
	}
	@ExceptionHandler
	public ResponseEntity<StudentResponseEntity> handleException(StudentNotFounException exe)
	{
		return new ResponseEntity<StudentResponseEntity>(new StudentResponseEntity(HttpStatus.NOT_FOUND.value(),exe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
		
//		 StringBuffer br=new StringBuffer(); br.append(HttpStatus.NOT_FOUND);
//		 br.append(snfe.getMessage()); br.append(System.currentTimeMillis()); return
//		 new ResponseEntity<Object>(br,HttpStatus.NOT_FOUND);
		 
	}
	@ExceptionHandler
	public ResponseEntity<StudentResponseEntity> handleNumberFormatException(NumberFormatException ipme)
	{
		return new ResponseEntity<StudentResponseEntity>(new StudentResponseEntity(HttpStatus.BAD_REQUEST.value(),"must provide numeric value", System.currentTimeMillis()),HttpStatus.BAD_REQUEST);
	}

}
