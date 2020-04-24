package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ImageDao;

@SpringBootApplication
public class SpringBootRestRepositoryApplication
{
	private ImageDao imageDao;
	
    @Autowired
	public SpringBootRestRepositoryApplication(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestRepositoryApplication.class, args);
	}

}
