package com.example.demo.Service;

import com.example.demo.entity.Account;

public interface AccountService
{
	public Iterable<Account> getAllAccounts();
	public Account addAcccount(Account account);
	public Account getAccountById(Integer id);

}
