package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SchoolService;

@RestController
public class SchoolController 
{
	private SchoolService schoolService;

	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	@GetMapping("/students/{school}")
	public List<Object> getStudentsbySchoolName(@PathVariable String school) 
	{
		return schoolService.getStudentsbySchoolName(school);
		
	}

}
