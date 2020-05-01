package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.entity.Account;


@Service
public class AccountService 
{
	private static final String QUEUE = "accounts-queue";
	
	private AccountDao accountDao;

	public AccountService(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}
	
	@RabbitListener(queues = QUEUE)
	@Transactional
	public void receiveMessage(Account account) 
	{
		
		System.out.println("Received Message from accounts Queue >>" + account);
		accountDao.save(account);
		
	}
	@Transactional
	public Iterable<Account> getAll()
	{
		return accountDao.findAll();
	}
	public Account getById(int id)
	{
	
		return accountDao.findById(id).get();
	}
	public Account update(Account account)
	{
		return accountDao.save(account);
	}
	
	public void delete(int id)
	{
		accountDao.deleteById(id);
	}

}
