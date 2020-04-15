package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project 
{
	@Id
	
	@Column(name="project_id")
	private int id;
	@Column(name="project_name")
	private String projectName;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Project(int id,String projectName) {
		super();
		this.id=id;
		this.projectName = projectName;

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + "]";
	}
	
	

}
