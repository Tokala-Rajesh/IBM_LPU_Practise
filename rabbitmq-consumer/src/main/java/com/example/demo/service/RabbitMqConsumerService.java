package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.ItemDao;
import com.example.demo.entity.Item;

@Service
@EnableTransactionManagement
public class RabbitMqConsumerService
{
	private static final String QUEUE = "items-queue";
	
	List<Item> items=new ArrayList<Item>();
	
	private ItemDao itemDao;
	

	public RabbitMqConsumerService(ItemDao itemDao) {
		super();
		this.itemDao = itemDao;
	}


	@RabbitListener(queues = QUEUE)
	@Transactional
	public void receiveMessage(Item item) 
	{
		//items.add(item);
		System.out.println("Received Message from Items Queue >>" + item);
//		if(items.isEmpty())
//		{
//		for(Item i: items)
//		{
//			itemDao.save(i);
//		}
//		}
		itemDao.save(item);
		
	}

}
