package com.example.demo;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static CustomerService service=null;
	static 
	{
		service=new CustomerServiceImpl();
	}
	private static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
        String name,email;
        int availableChoice=0;
    	boolean isAvailable=false;
        int choice=0;
        do
        {
        	System.out.println("1. Create a Customer");
			System.out.println("2. Display All details of Customers");
			System.out.println("3. Diplay details of customer by id");
			System.out.println("4. Update details of customer by id");
			System.out.println("5. Update details of customer by name");
			System.out.print("enter your choice:  ");
			
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the customer name");
				name=scanner.next();
				System.out.println("enter the customer email id");
				email=scanner.next();
				System.out.println("1. press 1 for Yes");
     	        System.out.println("2. press 2 for No");
   			    availableChoice= scanner.nextInt();
   			    scanner.nextLine();
   			    if(availableChoice==1)
   			    	isAvailable=true;
   			    else
   			    	isAvailable=false;
   			    
   			    Customer customer=new Customer();
   			    customer.setCustomerid(UUID.randomUUID().toString());
   			    customer.setCustomerName(name);
   			    customer.setEmail(email);
   			    customer.setActive(isAvailable);
   			    customer=service.createCustomer(customer);
                System.out.println(customer);
			
				break;
			case 2:
				List<Customer> list=service.DiaplayAll();
				for(Customer cus:list)
				{
					System.out.println(cus);
				}
				break;
			case 3:
				System.out.print("Enter Customer id: ");
				customer=service.getCustomerById(scanner.next());
				if(customer==null)
				{
					System.out.println("No Such Student Found With given ID: ");
				}
				else
				{
					System.out.println(customer);
				}
				break;
			case 4:
				System.out.println("enter the customer id");
				customer=service.getCustomerById(scanner.next());
				if(customer==null)
				{
					System.out.println("No Such Student Found With given ID: ");
				}
				else
				{
					System.out.println("enter the customer name");
					name=scanner.next();
					System.out.println("enter the customer email id");
					email=scanner.next();
					System.out.println("1. press 1 for Yes");
	     	        System.out.println("2. press 2 for No");
	   			    availableChoice= scanner.nextInt();
	   			    scanner.nextLine();
	   			    if(availableChoice==1)
	   			    	isAvailable=true;
	   			    else
	   			    	isAvailable=false;
	
	   			    customer.setCustomerName(name);
	   			    customer.setEmail(email);
	   			    customer.setActive(isAvailable);
	   			   
					service.updatebyId(customer);
					System.out.println(customer);
				}
				
				break;
			case 5:
//				System.out.println("enter the customer name");
//				customer=service.getCustomerName(scanner.next());
//				if(customer==null)
//				{
//					System.out.println("No Such Student Found With given ID: ");
//				}
//				else
//				{
//					System.out.println("enter the customer name");
//					name=scanner.next();
//					System.out.println("enter the customer email id");
//					email=scanner.next();
//					System.out.println("1. press 1 for Yes");
//	     	        System.out.println("2. press 2 for No");
//	   			    availableChoice= scanner.nextInt();
//	   			    scanner.nextLine();
//	   			    if(availableChoice==1)
//	   			    	isAvailable=true;
//	   			    else
//	   			    	isAvailable=false;
//	
//	   			    customer.setCustomerName(name);
//	   			    customer.setEmail(email);
//	   			    customer.setActive(isAvailable);
//	   			   
//					service.updatebyId(customer);
//					System.out.println(customer);
//				}
				break;
			case 0:
				System.out.println("Bye");
				System.exit(0);
				break;
			default:
				break;
			}
        	
        }while(choice!=0);
    }
}
