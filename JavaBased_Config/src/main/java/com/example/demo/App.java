package com.example.demo;


                                                                                                                                                                                                    
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bean.Image;
import com.example.demo.config.JDBC_Config;
import com.example.demo.config.MyConfig;

import com.example.demo.service.ImageService;
import com.example.demo.service.ImageServiceImpl;


public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
    	 ImageService service=context.getBean("imageServiceImpl",ImageServiceImpl.class);
         Image image=context.getBean("image",Image.class);
         //String str[]=UUID.randomUUID().toString().split("-");
         image.setImageID(UUID.randomUUID().toString());
         image.setImageURL("rajesh url");
         image=service.insert(image);
         System.out.println(image);
    }
}
