package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Project;
import com.example.demo.dto.ProjectDto;
import com.example.demo.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectRestController 
{
	private ProjectService projectService;

	public ProjectRestController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}
	@GetMapping("/projects")
    public ResponseEntity<Object> getAllProjects() 
	{
	  return new ResponseEntity<>(projectService.getAllProjects(), HttpStatus.OK);
    }

	 @GetMapping("/projects/{id}")
	 public ResponseEntity<Project> getProjectById(@PathVariable Integer id)
	 {
	  return new ResponseEntity(projectService.getProject(id),HttpStatus.OK);
	 }
	 @PostMapping("/projects")
	 public ResponseEntity<ProjectDto> AddProject(@RequestBody ProjectDto projectDto)
	 {
		return  new ResponseEntity(projectService.AddProject(projectDto),HttpStatus.OK);
		 
	 }
	 @PutMapping("/projects")
	 public ResponseEntity<Project> update(@RequestBody Project project)
	 {
		 return  new ResponseEntity(projectService.update(project),HttpStatus.OK);
	 }
	 @DeleteMapping("/projects/{id}")
	 public ResponseEntity<Project> deleteById(@PathVariable Integer id)
	 {
	  return new ResponseEntity(projectService.deleteProject(id),HttpStatus.OK);
	 }

}
