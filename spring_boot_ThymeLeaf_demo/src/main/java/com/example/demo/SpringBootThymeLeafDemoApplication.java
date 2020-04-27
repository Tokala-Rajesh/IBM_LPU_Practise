package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

@SpringBootApplication
public class SpringBootThymeLeafDemoApplication implements CommandLineRunner
{
	private ProductDao dao;
	

	public SpringBootThymeLeafDemoApplication(ProductDao dao) {
		super();
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeLeafDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Product product =new Product("amazon",230.30,"amazon.com");
		dao.addProducts(product);
		product =new Product("flipcart",230.30,"amazon.com");
		dao.addProducts(product);
		
		// TODO Auto-generated method stub
		
	}

}
