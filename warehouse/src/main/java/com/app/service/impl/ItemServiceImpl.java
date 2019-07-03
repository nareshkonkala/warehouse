package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ItemDao;
import com.app.model.Item;
import com.app.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao dao;
	
	@Transactional
	@Override
	public Integer saveItem(Item iob) {
		return dao.saveItem(iob);
	}

	@Transactional
	@Override
	public void updateItem(Item iob) {
		dao.updateItem(iob);
	}

	@Transactional
	@Override
	public void deleteItem(Integer id) {
		dao.deleteItem(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Item getOneItemById(Integer id) {
		return dao.getOneItemById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Item> getAllItems() {
		return dao.getAllItems();
	}

}
