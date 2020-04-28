package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class AlbumServiceImpl implements AlbumService 
{
	
	private RestTemplate restTemplate;
	
	@Autowired
	public AlbumServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}


	@Override
	public List<Object> getImages() {
	
		return (List<Object>) restTemplate.getForObject("http://IMAGE-SERVICE/images",Object.class);
	}

}
