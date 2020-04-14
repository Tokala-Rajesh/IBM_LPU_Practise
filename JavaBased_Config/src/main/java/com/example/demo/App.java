package com.example.demo;

import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.Image;
import com.example.demo.config.MyConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
         Image image=context.getBean("image",Image.class);
         image.setImageID(UUID.randomUUID().toString());
         image.setImageURL("rajesh url");
         System.out.println(image);
    }
}
