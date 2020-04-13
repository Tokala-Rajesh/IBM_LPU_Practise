package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountException;

public interface AccountService
{
	public Account createAccount(Account account);
	public Account updateById(Account account);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
	public List<Account> findByAmount(int amount);
	public void deleteById(String accountNumber) throws AccountException ;



}
