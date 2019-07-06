package com.app.dao;

import java.util.List;

import com.app.model.Purchase;

public interface PurchaseDao {
	
	public Integer saveOrder(Purchase pob);
	public void updatePurchaseOrder(Purchase pob);
	public void deletePurchaseOrder(Integer id);
	
	public Purchase getOnePurchaseOrder(Integer id);
	public List<Purchase> gerAllPurchaseOrders();
	
		
}
