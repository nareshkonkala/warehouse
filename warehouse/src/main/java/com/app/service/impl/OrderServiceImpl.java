package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderDao;
import com.app.model.Order;
import com.app.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private IOrderDao dao;

	@Transactional
	@Override
	public Integer saveOrder(Order order) {

		return dao.saveOrder(order);
	}

	@Transactional
	@Override
	public void updateOrder(Order order) {

		dao.updateOrder(order);
	}

	@Transactional
	@Override
	public void deleteOrder(Integer id) {

		dao.deleteOrder(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Order getOneOrder(Integer id) {

		return dao.getOneOrder(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Order> getAllOrders() {

		return dao.getAllOrders();
	}

}
