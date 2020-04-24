package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ProjectDao;
import com.example.demo.data.Project;

@SpringBootApplication
public class SpringBootDtoManualApplication implements CommandLineRunner{
     private ProjectDao projectDao;
     
	public SpringBootDtoManualApplication(ProjectDao projectDao) {
		super();
		this.projectDao = projectDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoManualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		projectDao.save(new Project("demo project 1", "demo description-1", "demo agent-1"));
		projectDao.save(new Project("demo project 2", "demo description-2", "demo agent-2"));
		projectDao.save(new Project("demo project 3", "demo description-3", "demo agent-3"));
		projectDao.save(new Project("demo project 4", "demo description-4", "demo agent-4"));
		
		
	}

}
