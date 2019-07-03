package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IOrderDao;
import com.app.model.Order;

@Repository
public class OrderDaoImpl implements IOrderDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Integer saveOrder(Order order) {
		
		return (Integer) ht.save(order);
	}

	@Override
	public void updateOrder(Order order) {

		ht.update(order);
	}

	@Override
	public void deleteOrder(Integer id) {
		
		ht.delete(new Order(id));
	}

	@Override
	public Order getOneOrder(Integer id) {
		
		return ht.get(Order.class, id);
	}

	@Override
	public List<Order> getAllOrders() {

		return ht.loadAll(Order.class);
	}

}
