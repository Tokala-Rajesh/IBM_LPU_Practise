package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.AccountDao;
import com.example.demo.entity.Account;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceClientApplication implements CommandLineRunner 
{
	private AccountDao accountDao;
	

	public AccountServiceClientApplication(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Account account=new Account(12,"253636ty");
		accountDao.save(account);
		account=new Account(13,"25363678dty");
		accountDao.save(account);
		// TODO Auto-generated method stub
		
	}

}
