package com.example.model;

public class Image 
{
	private String imageId;
	private String imageUrl;
	private boolean isAvailable;
	public Image(String imageId, String imageUrl, boolean isAvailable) {
		super();
		this.imageId = imageId;
		this.imageUrl = imageUrl;
		this.isAvailable = isAvailable;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageUrl=" + imageUrl + ", isAvailable=" + isAvailable + "]";
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
