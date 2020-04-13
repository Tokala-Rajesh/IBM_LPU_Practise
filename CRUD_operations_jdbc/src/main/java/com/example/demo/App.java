package com.example.demo;

import java.util.List;
import java.util.Scanner;

import com.example.model.Image;
import com.example.service.ImageService;
import com.example.service.ImageServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private ImageService service;
	private static Scanner scanner = new Scanner(System.in);

	{
		service = new ImageServiceImpl();
	}
    public static void main( String[] args )
    {
    	int choice=0;
    	String imageId=null;
    	String imageUrl=null;
    	int availableChoice=0;
    	boolean isAvailable=false;
    	App app = new App();
    	do
    	{
    		System.out.println("1.Create a Record");
    		System.out.println("2.Display all");
    		System.out.println("3.Get image by id");
    		System.out.println("4.update");
    		System.out.println("5.delete");
    		choice=scanner.nextInt();
    		switch(choice)
    		{
    		case 1:
    			System.out.println("enter the image id");    	
     	        imageId=scanner.next();    	
    	        System.out.println("enter the image url");
     	        imageUrl=scanner.next();
     	        System.out.println("1. press 1 for Yes");
     	        System.out.println("2. press 2 for No");
   			    availableChoice= scanner.nextInt();
   			    scanner.nextLine();
   			    if(availableChoice==1)
   			    	isAvailable=true;
   			    else
   			    	isAvailable=false;
   			    app.service.createRecord(new Image(imageId,imageUrl,isAvailable));
    			break;
    		case 2:
    			List<Image> listImages = app.service.DisplayAll();
    			for(Image img:listImages) {
    				System.out.println(img);
    			}
    			break;
    		case 3:
    			break;
    		case 4:
    			Image img= new Image();
    			System.out.println("Enter the image id :");
    			imageId=scanner.next();
    			System.out.println("Enter the image url");
    			String imgUrl=scanner.next();
    			System.out.println("Enter the status : ");
    		    boolean isav=scanner.nextBoolean();
    		
    			//System.out.println("Enter the image url");
    			img.setImageUrl(scanner.next());
    			//System.out.println("Enter the status : ");
    			img.setAvailable(scanner.nextBoolean());
    			
    			
    			app.service.update(new Image(imageId,imgUrl,isav));

    			break;
    		case 5:
    			System.out.println("Enter the image id : ");
    			String id =scanner.next();
    			app.service.delete(id);
    			break;
    		case 0:
    			break;
    		}
    		
    	}while(choice!=0);
        
    }
}
