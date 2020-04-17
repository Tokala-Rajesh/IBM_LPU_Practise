package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.OrderDao;
import com.example.dao.OrderDaoImpl;
import com.example.entity.Customer;

import com.example.entity.Order;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;
import com.example.service.OrderService;
import com.example.service.OrderServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");    
        CustomerService service = context.getBean("customerServiceImpl",CustomerServiceImpl.class);
        OrderService service1 = context.getBean("orderServiceImpl",OrderServiceImpl.class);
        int choice=0;
        do
        {
        	System.out.println("1. Add customer");
        	System.out.println("2. Add order");
        	System.out.println("3. Set order to customer");
        	System.out.println("4. Get customer by id");
        	
        	
        }while(choice!=0);
//        System.out.println("Enter the name");
//    	String name = scanner.next();
//    	Customer cus=service.addCustomer(new Customer(name));
      //  int id = 1;
		//Customer c=service.getCustomer(1);	
       // Order o=service
		//System.out.println(o);
//		c.addOrder(new Order("Nirmal"));
   //     Order o=service1.addOrder(new Order("Nirmal"));
		
//		
//		System.out.println("Enter the Customer id");
//      	int sid = scanner.nextInt();
//      	System.out.println("Enter the order id");
//      	int eid = scanner.nextInt();
//      	Customer ob1 = service.getCustomer(sid);
//      	Order ob2 = service1.getOrder(eid);
//      	ob2.setCustomer(ob1);;
//      	ob1.addOrder(ob2);;
//      	service1.addOrder(ob2);
        
        List<Order> list = service1.getAllOrders();
     	for(Order obj3 : list)
     	{
     		System.out.println(obj3);
     	}

    }
}
