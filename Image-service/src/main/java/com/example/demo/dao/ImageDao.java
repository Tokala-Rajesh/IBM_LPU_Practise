package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Image;

public interface ImageDao 
{
	public Image add(Image image);
	public List<Image> listall();

}
