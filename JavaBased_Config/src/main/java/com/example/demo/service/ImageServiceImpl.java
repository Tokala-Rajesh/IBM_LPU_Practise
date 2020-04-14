package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Image;
import com.example.demo.dao.ImageDao;
@Service
public class ImageServiceImpl implements ImageService
{
	private ImageDao imagedao;
	
    @Autowired
	public ImageServiceImpl(ImageDao imagedao) {
		super();
		this.imagedao = imagedao;
	}


	public Image insert(Image image) 
	{
		// TODO Auto-generated method stub
		return imagedao.insert(image);
	}

}
