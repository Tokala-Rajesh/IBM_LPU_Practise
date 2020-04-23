package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.InstructorDAO;
import com.example.demo.entity.Instructor;

@RestController
@RequestMapping("/api")
public class InstructorController {

	@Autowired
	private InstructorDAO instructorDAO;
	
	
	
	@PostMapping("/instructors")
	public void create(@RequestBody Instructor instructor)
	{
		instructorDAO.createInstructor(instructor);
	}
	@GetMapping("/instructors")
	public List<Instructor> getAllInstructorswithDetails()
	{
		return instructorDAO.getAllInstructorswithDetails();
	}
	@GetMapping("/instructors/{id}")
	public Instructor getInstructorById(@PathVariable int id)
	{
		return instructorDAO.getInstructorById(id);
	}
	@PutMapping("/instructors")
	public void updateInstructor(@RequestBody Instructor instructor)
	{
		instructorDAO.updateInstructor(instructor);
	}
	@DeleteMapping("/instructors")
	public void deleteInstructorbyId(@PathVariable int id)
	{
		instructorDAO.deleteInstructorbyId(id);
	}
	
	
	
	
}
