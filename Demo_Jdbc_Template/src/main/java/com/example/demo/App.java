package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountType;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService service=context.getBean("accountServiceImpl",AccountServiceImpl.class);
		Account account=context.getBean("account",Account.class);
		String str[]=UUID.randomUUID().toString().split("-");
		int choice=0;
		String accountNumber=null;
		String accountType=null;
		int initialBalance;
		do
		{
			System.out.println("1.Create a Record");
			System.out.println("2.List all records");
			System.out.println("3.Find account by account number");
			System.out.println("4.Update a record");
			System.out.println("5.delete a record");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				account.setAccountNumber(str[0]);
				account.setAccountType("Debit_card");
				account.setInitialBalance(104509);
				account=service.createAccount(account);
				System.out.println(account);
				break;
			case 2:
				List<Account> list=service.getAllAccountDetails();
				Iterator<Account> iter=list.iterator();
			    while(iter.hasNext()) 
			    { 
					 Account account2=iter.next();
				     System.out.println(account2); 
				 }
				break;
			case 3:
				account=service.findByAccountNumber("e38ea3ca");
				System.out.println(account);
				
				break;
			case 4:
				System.out.println("Enter the account number");
				accountNumber=scanner.next();
				System.out.println("Enter the account Type");
				accountType=scanner.next();
				System.out.println("enetr the account balance");
				int intialBalance=scanner.nextInt();
				account.getAccountNumber();
				//account.setAccountNumber(accountNumber);
				account.setAccountType(accountType);
				account.setInitialBalance(intialBalance);
				account=service.updateById(account);
				System.out.println(account);
				break;
			}
			
			
		}while(choice!=0);
		
		 
    }
}
