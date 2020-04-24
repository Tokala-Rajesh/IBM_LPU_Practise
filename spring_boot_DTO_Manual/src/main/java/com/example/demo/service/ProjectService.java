package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.example.demo.data.Project;
import com.example.demo.dto.ProjectDto;

public interface ProjectService
{
	 public ProjectDto getProject(Integer id);
	 public List<ProjectDto> getAllProjects();
	 public ResponseEntity<ProjectDto> AddProject(ProjectDto projectDto);
	 public Project update(Project project);
	 public ProjectDto deleteProject(Integer id);
	 public Iterable<Project> findByName(String name); 
	 public Iterable<Project> findByNameAndAgentName(String name, String agentName); 
	 public void deleteByName(String name);
	 

}
