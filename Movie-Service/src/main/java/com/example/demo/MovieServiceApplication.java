package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.MovieDao;
import com.example.demo.entity.Movie;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieServiceApplication implements CommandLineRunner
{
	private MovieDao movieDao;
	

	public MovieServiceApplication(MovieDao movieDao) {
		super();
		this.movieDao = movieDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Movie mv=new Movie("Jersey",2019);
		movieDao.save(mv);
		mv=new Movie("Bhaubali",2016);
		movieDao.save(mv);
		
		// TODO Auto-generated method stub
		
	}

}
