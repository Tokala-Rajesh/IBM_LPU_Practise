package com.example.service;

import java.util.List;

import com.example.entity.Order;

public interface OrderService {
	public Order addOrder(Order order);
	public  Order getOrder(int id) ;
	 public List<Order> getAllOrders();
}
