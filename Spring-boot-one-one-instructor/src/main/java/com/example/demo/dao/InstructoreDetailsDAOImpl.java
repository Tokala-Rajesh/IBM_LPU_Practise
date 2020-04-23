package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;
@Repository("instructorDeatailsDAO")
@EnableTransactionManagement
public class InstructoreDetailsDAOImpl implements InstructorDeatailsDAO 
{
	@Autowired
	private EntityManager entityManager1;

	@Override
	@Transactional
	public void createInstructorDetails(InstructorDetail instructorDetail) 
	{
	   Instructor inst=instructorDetail.getInstructor();
	   inst.setInstructorDetail(instructorDetail);
		// TODO Auto-generated method stub
		entityManager1.persist(inst);

	}

	@Override
	public List<InstructorDetail> getAllInstructorsDetailswithInstructor() {
		List<InstructorDetail> instr =  entityManager1.createQuery("from InstructorDetail",InstructorDetail.class).getResultList();
		// TODO Auto-generated method stub
		return instr;
	}

	@Override
	public InstructorDetail getInstructorDeatilsandInstructorById(int id) {
		// TODO Auto-generated method stub
		return entityManager1.find(InstructorDetail.class, id);
	}

	@Override
	@Transactional
	public void updateInstructorDetailsbyId(InstructorDetail instructorDetail)
	{
		entityManager1.merge(instructorDetail);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteInstructorDetailsbyId(int id)
	{
		entityManager1.remove(entityManager1.find(InstructorDetail.class, id));
		// TODO Auto-generated method stub
		
	}

}
