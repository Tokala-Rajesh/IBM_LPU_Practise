package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication implements CommandLineRunner
{
	private UserDao dao;
	
    @Autowired
	public UserServiceApplication(UserDao dao) {
		super();
		this.dao = dao;
	}
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	@Override
	public void run(String... args) throws Exception 
	{
		User u=new User("rajesh");
		dao.save(u);
	    u=new User("rakesh");
		dao.save(u);
		// TODO Auto-generated method stub
		
	}

}
