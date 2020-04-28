package com.example.demo.controller;

import java.util.List;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ImageDao;
import com.example.demo.entity.Image;

@RestController
public class ImageController
{
	private ImageDao imageDao;

	public ImageController(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}
	@RequestMapping("/images")
    public List<Image> getALL()
    {
    	return imageDao.listall();
    }
}
