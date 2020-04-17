package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.OrderDao;
import com.example.entity.Order;
@Service
public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao;
	@Autowired
	public OrderServiceImpl(OrderDao orderDao) {
		super();
		this.orderDao = orderDao;
	}
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.addOrder(order);
	}
	public Order getOrder(int id) {
		// TODO Auto-generated method stub
		return orderDao.getOrder(id);
	}
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderDao.getAllOrders();
	}

}
