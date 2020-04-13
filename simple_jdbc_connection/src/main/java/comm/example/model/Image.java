package comm.example.model;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class Image {
	
	private String imageID;
	private String imageUrl;
	private boolean isAvailable;
	public String getImageID() {
		return imageID;
	}
	public void setImageID(String imageID) {
		this.imageID = imageID;
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
	public Image(String imageID, String imageUrl, boolean isAvailable) {
		super();
		this.imageID = imageID;
		this.imageUrl = imageUrl;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Image [imageID=" + imageID + ", imageUrl=" + imageUrl + ", isAvailable=" + isAvailable + "]";
	}
	
	

}
