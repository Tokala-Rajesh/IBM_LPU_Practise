package com.example.service;

import java.util.List;

import com.example.dao.ImageDao;
import com.example.dao.ImageDaoImpl;
import com.example.model.Image;

public class ImageServiceImpl implements ImageService
{
	private ImageDao objImage;
	{
		objImage=new ImageDaoImpl();
	}

	public void createRecord(Image img)
	{
		objImage.createRecord(img);
		// TODO Auto-generated method stub
		
	}

	public List<Image> DisplayAll() 
	{
		// TODO Auto-generated method stub
		return objImage.DisplayAll();
	}

	public Image getImageByImageId(String imageId) 
	{
		// TODO Auto-generated method stub
		return objImage.getImageByImageId(imageId);
	}

	public void update(Image img) 
	{
		objImage.update(img);
		// TODO Auto-generated method stub
		
	}

	public void delete(String imageId)
	{
		objImage.delete(imageId);
		// TODO Auto-generated method stub
		
	}

}
