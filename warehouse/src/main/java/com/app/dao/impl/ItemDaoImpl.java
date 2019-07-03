package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ItemDao;
import com.app.model.Item;
@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveItem(Item iob) {

		return (Integer) ht.save(iob);
	}

	@Override
	public void updateItem(Item iob) {

		ht.update(iob);
	}

	@Override
	public void deleteItem(Integer id) {

		ht.delete(new Item(id));
	}

	@Override
	public Item getOneItemById(Integer id) {
		
		return ht.get(Item.class, id);
	}

	@Override
	public List<Item> getAllItems() {

		return ht.loadAll(Item.class);
	}

}
