package com.app.dao;

import java.util.List;

import com.app.model.Item;

public interface ItemDao {

	public Integer saveItem(Item iob);
	public void updateItem(Item iob);
	public void deleteItem(Integer id);
	
	public Item getOneItemById(Integer id);
	public List<Item> getAllItems();
	
	
}
