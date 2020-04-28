package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Image
{
	@Id
	@Column(name="image_id")
	private int imageId;
	@Column(name="image_url")
	private String imageUrl;
	
	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Image( String imageUrl) {
		super();
		
		this.imageUrl = imageUrl;
	}


	public int getImageId() {
		return imageId;
	}


	public void setImageId(int imageId) {
		this.imageId = imageId;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageUrl=" + imageUrl + "]";
	}
	

	
	

}
