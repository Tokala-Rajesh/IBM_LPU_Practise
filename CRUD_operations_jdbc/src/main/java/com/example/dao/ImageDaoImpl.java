package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.factory.MyConnectionFactory;
import com.example.model.Image;

public class ImageDaoImpl implements ImageDao 
{
	MyConnectionFactory factory=MyConnectionFactory.getConnectionObject();

	public void createRecord(Image img) 
	{
		try {
			Connection connect=factory.getMyConnection();	
		
		PreparedStatement psInsert=connect.prepareStatement("insert into image value(?,?,?)");
		psInsert.setString(1, img.getImageId());
		psInsert.setString(2, img.getImageUrl());
		psInsert.setBoolean(3, img.isAvailable());
		psInsert.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Image> DisplayAll() 
	{
		ResultSet rs;
		try {
			Connection connect=factory.getMyConnection();	
		
		PreparedStatement psDisplay=connect.prepareStatement("select * from image");
		rs=psDisplay.executeQuery();
		List<Image> listImages = new ArrayList<Image>();
		while (rs.next()) 
		{
			listImages.add(new Image(rs.getString(1), rs.getString(2), rs.getBoolean(3)));
		}
		return listImages;
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Image getImageByImageId(String imageId) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Image img)
	{
		try {
			Connection connect=factory.getMyConnection();	
		
		PreparedStatement psUpdate=connect.prepareStatement("Update image set imageUrl=?,isAvailable=? where imageId=?");
		//System.out.println("enter new image url");
		
		psUpdate.setString(1,img.getImageUrl());
		psUpdate.setBoolean(2, img.isAvailable());
		psUpdate.setString(3,img.getImageId());
		psUpdate.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public void delete(String imageId) 
	{
		try {
			Connection connect=factory.getMyConnection();	
		
		PreparedStatement psDelete=connect.prepareStatement("Delete from image where imageId=?");
		psDelete.setString(1, imageId);
		psDelete.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}

}
