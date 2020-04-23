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
import com.example.demo.dao.InstructorDeatailsDAO;
import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;


@RestController
@RequestMapping("/api")
public class InstructorController {

	@Autowired
	private InstructorDAO instructorDAO;
	@Autowired
	private InstructorDeatailsDAO instructorDeatailsDAO;
	
	
	
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
		Instructor inst=instructorDAO.getInstructorById(id);
		if(inst==null)
		{
			throw new InstructorNotFoundException("No such id found"  + id);
		}
		return inst;
	}
	@PutMapping("/instructors")
	public void updateInstructor(@RequestBody Instructor instructor)
	{
		instructorDAO.updateInstructor(instructor);
	}
	@DeleteMapping("/instructors/{id}")
	public void deleteInstructorbyId(@PathVariable int id)
	{
		instructorDAO.deleteInstructorbyId(id);
	}
	
	
	
	@PostMapping("/instructorDetails")
	public void createInstructorDetails(@RequestBody InstructorDetail instructorDetail)
	{
		instructorDeatailsDAO.createInstructorDetails(instructorDetail);
	}
	@GetMapping("/instructorDetails")
	public List<InstructorDetail> getAllInstructorsDetailswithInstructor()
	{
		return instructorDeatailsDAO.getAllInstructorsDetailswithInstructor();
	}
	@GetMapping("/instructorDetails/{id}")
    public InstructorDetail getInstructorDeatilsandInstructorById( @PathVariable int id)
    {
    	return instructorDeatailsDAO.getInstructorDeatilsandInstructorById(id);
    }
	@PutMapping("/instructorDetails")
	public void updateInstructorDetailsbyId(@RequestBody InstructorDetail instructorDetail)
	{
		instructorDeatailsDAO.updateInstructorDetailsbyId(instructorDetail);
	}
	@DeleteMapping("/instructorDetails/{id}")
	public void deleteInstructorDetailsbyId(@PathVariable int id)
	{
		instructorDeatailsDAO.deleteInstructorDetailsbyId(id);
	}
	
	
	
	
}
