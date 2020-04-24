package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Project;
@Repository
public interface ProjectDao extends CrudRepository<Project, Integer>
{
	@Query
	public Iterable<Project> findByName(String name); 
	@Query
	public Iterable<Project> findByNameAndAgentName(String name, String agentName); 
	public void deleteByName(String name);
	

}
