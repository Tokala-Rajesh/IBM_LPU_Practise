package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Image
{
	private String imageID;
	private String imageURL;
	@Override
	public String toString() {
		return "Image [imageID=" + imageID + ", imageURL=" + imageURL + "]";
	}
	public String getImageID() {
		return imageID;
	}
	public void setImageID(String imageID) {
		this.imageID = imageID;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

}
