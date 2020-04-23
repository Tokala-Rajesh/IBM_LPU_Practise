package com.example.demo.dao;

import java.util.List;


import com.example.demo.entity.InstructorDetail;

public interface InstructorDeatailsDAO
{
	public void createInstructorDetails(InstructorDetail instructorDetail);
	public List<InstructorDetail> getAllInstructorsDetailswithInstructor();
	public InstructorDetail getInstructorDeatilsandInstructorById(int id);
	public void updateInstructorDetailsbyId(InstructorDetail instructorDetail);
	public void deleteInstructorDetailsbyId(int id);

}
