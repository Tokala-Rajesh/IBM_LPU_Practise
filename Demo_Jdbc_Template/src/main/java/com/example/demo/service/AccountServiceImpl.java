package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountException;
import com.example.demo.repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService
{
	private AccountRepo accountRepo;

	@Autowired
	public AccountServiceImpl(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}

	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepo.createAccount(account);
	}
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return accountRepo.getAllAccountDetails();
	}
	
	public Account updateById(Account account) {
		// TODO Auto-generated method stub
		return accountRepo.updateById(account);
	}

	public Account findByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return accountRepo.findByAccountNumber(accountNumber);
	}

	public List<Account> findByAmount(int amount) {
		// TODO Auto-generated method stub
		return accountRepo.findByAmount(amount);
	}

	public void deleteById(String accountNumber) throws AccountException 
	{
		accountRepo.deleteById(accountNumber);
		
		
	}

	

}
