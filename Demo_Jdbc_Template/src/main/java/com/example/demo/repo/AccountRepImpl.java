package com.example.demo.repo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountException;
import com.example.demo.bean.AccountRowMapper;
//import com.example.demo.bean.PostContructor;

@Repository
public class AccountRepImpl implements AccountRepo 
{

	private JdbcTemplate jdbcTemplate;
	private Logger logger=Logger.getLogger("AccountRepImpl");
	@Autowired
	public AccountRepImpl(JdbcTemplate jdbcTemplate)
	{
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Account createAccount(Account account)
	{
		// TODO Auto-generated method stub
		String query="insert into account(accountNumber,accountType,balance) values('"+account.getAccountNumber()+"','"+account.getAccountType()+"',"+account.getInitialBalance()+")";	
		jdbcTemplate.update(query);
		
		return account;
	}
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		List<Account> accounts=jdbcTemplate.query("select * from account",new AccountRowMapper());
		//List<Account> accounts=jdbcTemplate.query("select * from account", new BeanPropertyRowMapper(Account.class));
		return accounts;
	}
	public Account findByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from account where accountNumber=?", new Object[] {accountNumber},new AccountRowMapper());
	}
	public Account updateById(Account account)
	{
		String query="update account set accountType=?, balance=? where accountNumber=?";
		int result=jdbcTemplate.update(query,account.getAccountType(),account.getInitialBalance(),account.getAccountNumber());
		if(result==0)
		{
			System.out.println("there is no account find in the data base please check once again");
		}
		else
		{
			System.out.println("details updated succesfully");
		}
		// TODO Auto-generated method stub
		return null;
	}
	public List<Account> findByAmount(int amount) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from account where balance>?",new Object[] {amount},new AccountRowMapper());
	}



	public void deleteById(String accountNumber)  { //throws AccountException
		// TODO Auto-generated method stub
		String str="delete from account where accountNumber='"+accountNumber+"'";
		int result=jdbcTemplate.update(str);
		if(result==0)
		{
			System.out.println("there is no account find in the data base please check once agail");
		 
		}
		else
		{
			System.out.println("account deleted successfully with id: "+accountNumber);
		}
	}
	
	
	

}
