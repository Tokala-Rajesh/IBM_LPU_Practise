package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.ProjectDao;
import com.example.demo.data.Project;
import com.example.demo.dto.ProjectDto;
@Service
@EnableTransactionManagement
public class ProjectSrerviceImpl implements ProjectService
{
	private ProjectDao projectDao;
	

	public ProjectSrerviceImpl(ProjectDao projectDao) {
		super();
		this.projectDao = projectDao;
	}

	@Override
	public ProjectDto getProject(Integer id) 
	{
		if(projectDao.findById(id).isPresent())
		{
			Project project=projectDao.findById(id).get();
			ProjectDto dto=new ProjectDto(project.getName(),project.getDescription(),project.getAgentName());
			return dto;
		}
		else
		{
			return null;
			
		}
	}

	@Override
	public List<ProjectDto> getAllProjects() 
	{
		List<ProjectDto> list=new ArrayList<ProjectDto>();
		projectDao.findAll().forEach(project -> { list.add(new ProjectDto(project.getName(),project.getDescription(),project.getAgentName()));});
		
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public ResponseEntity<ProjectDto> AddProject(ProjectDto projectDto) 
	{
		Project project=new Project(projectDto.getName(),projectDto.getDescription(),projectDto.getAgentName());
		projectDao.save(project);
		// TODO Auto-generated method stub
		return ResponseEntity.ok().body(projectDto);
	}

	@Override
	public Project update(Project project)
	{
		return projectDao.save(project);
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProjectDto deleteProject(Integer id) 
	{
		if(projectDao.findById(id).isPresent())
		{
			Project project=projectDao.findById(id).get();
			
			ProjectDto dto=new ProjectDto(project.getName(),project.getDescription(),project.getAgentName());
			projectDao.deleteById(id);
			return dto;
		}
		else
		{
			return null;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Project> findByName(String name)
	{
		// TODO Auto-generated method stub
		return projectDao.findByName(name);
	}

	@Override
	public Iterable<Project> findByNameAndAgentName(String name, String agentName) {
		// TODO Auto-generated method stub
		return projectDao.findByNameAndAgentName(name, agentName);
	}
	@Transactional
	public void deleteByName(String name)
	{
		
		projectDao.deleteByName(name);
	}

}
