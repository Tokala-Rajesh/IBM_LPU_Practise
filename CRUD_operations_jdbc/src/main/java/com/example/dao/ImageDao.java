package com.example.dao;

import java.util.List;

import com.example.model.Image;

public interface ImageDao 
{
	
	public void createRecord(Image img);
	public List<Image> DisplayAll();
	public Image getImageByImageId(String imageId);
	public void update(Image img);
	public void delete(String imageId);

}
