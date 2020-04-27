package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.entity.Account;
@Service
public class AccountServiceImpl implements AccountService 
{
	private AccountDao accountDao;
	
    @Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	@Override
	public Iterable<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.findAll();
	}

	@Override
	public Account addAcccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.save(account);
	}

	@Override
	public Account getAccountById(Integer id) {
		// TODO Auto-generated method stub
		return accountDao.findById(id).get();
	}

}
