package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.ImageDao;
import com.example.demo.entity.Image;

@SpringBootApplication
@EnableDiscoveryClient
public class ImageServiceApplication implements CommandLineRunner
{
	private ImageDao dao;
	

	public ImageServiceApplication(ImageDao dao) {
		super();
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(ImageServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Image im=new Image("rajesh");
		dao.add(im);
		im=new Image("rakesh");
		dao.add(im);
		
		// TODO Auto-generated method stub
		
	}

}
