package com.example.demo.repo;

import java.util.List;

import com.example.demo.bean.Account;

public interface AccountRepo
{
	public Account createAccount(Account account);
	public Account updateById(Account account);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);

}
