package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Image;
@Repository
public class ImageDaoImpl implements ImageDao
{
	private JdbcTemplate jdbcTemplate;
	
    @Autowired
	public ImageDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	public Image insert(Image image) 
	{
		String sql="insert into image1(imageID,imageURL) values(?,?)";
		jdbcTemplate.update(sql,image.getImageID(),image.getImageURL());
		// TODO Auto-generated method stub
		return image;
	}

}
