package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService 
{
	private StudentDao studentDao;
	
	

	public StudentServiceImpl(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}



	@Override
	public Iterable<Student> findBySchool(String school) {
		// TODO Auto-generated method stub
		return studentDao.findBySchool(school);
	}

}
