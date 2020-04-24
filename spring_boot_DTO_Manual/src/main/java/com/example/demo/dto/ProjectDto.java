package com.example.demo.dto;

public class ProjectDto
{
	 private String name;
	 private String description;
	 private String agentName;
	 
	public ProjectDto(String name, String description, String agentName) {
		super();
		this.name = name;
		this.description = description;
		this.agentName = agentName;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getAgentName() {
		return agentName;
	}
	@Override
	public String toString() {
		return "ProjectDto [name=" + name + ", description=" + description + ", agentName=" + agentName + "]";
	} 
	 

}
