package com.app.service;

import java.util.List;

import com.app.model.Item;

public interface ItemService {

	public Integer saveItem(Item iob);
	public void updateItem(Item iob);
	public void deleteItem(Integer id);
	
	public Item getOneItemById(Integer id);
	public List<Item> getAllItems();
}
