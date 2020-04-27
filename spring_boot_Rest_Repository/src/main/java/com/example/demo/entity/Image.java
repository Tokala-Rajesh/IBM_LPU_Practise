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
	@Column(name="image_desc")
	private String imageDesc;
	@Column(name="available")
	@JsonProperty
	private boolean isAvailable;
	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Image(int imageId, String imageUrl, String imageDesc, boolean isAvailable) {
		super();
		this.imageId = imageId;
		this.imageUrl = imageUrl;
		this.imageDesc = imageDesc;
		this.isAvailable = isAvailable;
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
	public String getImageDesc() {
		return imageDesc;
	}
	public void setImageDesc(String imageDesc) {
		this.imageDesc = imageDesc;
	}
	

	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageUrl=" + imageUrl + ", imageDesc=" + imageDesc + ", isAvailable="
				+ isAvailable + "]";
	}



}
