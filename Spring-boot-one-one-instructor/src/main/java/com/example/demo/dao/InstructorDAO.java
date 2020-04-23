package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Instructor;

public interface InstructorDAO {

	public void createInstructor(Instructor instructor);
	public List<Instructor> getAllInstructorswithDetails();
	public Instructor getInstructorById(int id);
	public void updateInstructor(Instructor instructor);
	public void deleteInstructorbyId(int id);
}
