package com.app.service;

import java.util.List;

import com.app.model.Order;

public interface IOrderService {
	
	public Integer saveOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(Integer id);
	public Order getOneOrder(Integer id);
	public List<Order> getAllOrders();

}
