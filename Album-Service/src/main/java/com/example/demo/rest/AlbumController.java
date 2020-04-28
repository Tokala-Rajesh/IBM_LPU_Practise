package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AlbumService;

@RestController
public class AlbumController
{
	private AlbumService albumService;

	@Autowired
	public AlbumController(AlbumService albumService) {
		super();
		this.albumService = albumService;
	}
	
	@RequestMapping("/albums")
	public List<Object> getAllImages(){
		return albumService.getImages();
	}

}
