package com.example.demo.bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//@ToString
@Component("i")
public class Image {


	@Value(value = "id1")
	private String imageID;
	@Value("demourl1")
	private String imageURL;
	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
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
	public Image(String imageID, String imageURL) {
		super();
		this.imageID = imageID;
		this.imageURL = imageURL;
	}
	@Override
	public String toString() {
		return "Image [imageID=" + imageID + ", imageURL=" + imageURL + "]";
	}
	

}
