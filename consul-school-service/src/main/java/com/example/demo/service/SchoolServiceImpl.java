package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SchoolServiceImpl implements SchoolService 
{
	
    private RestTemplate restTemplate;
	
	@Autowired
	public SchoolServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@Override
	public List<Object> getStudentsbySchoolName(String school) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://consul-student-service/students/{school}",List.class , school);
	}

}
