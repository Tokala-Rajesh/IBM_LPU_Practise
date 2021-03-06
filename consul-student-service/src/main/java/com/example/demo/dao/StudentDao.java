package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.entity.Student;


@Repository
@EnableTransactionManagement
public interface StudentDao extends CrudRepository<Student, Integer> 
{
	public Iterable<Student> findBySchool(String school);

}
