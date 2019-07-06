package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.PurchaseDao;
import com.app.model.Purchase;
import com.app.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseDao dao;
	
	@Transactional
	@Override
	public Integer saveOrder(Purchase pob) {
		return dao.saveOrder(pob);
	}

	@Transactional
	@Override
	public void updatePurchaseOrder(Purchase pob) {

		dao.updatePurchaseOrder(pob);
	}

	@Transactional
	@Override
	public void deletePurchaseOrder(Integer id) {

		dao.deletePurchaseOrder(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Purchase getOnePurchaseOrder(Integer id) {
		return dao.getOnePurchaseOrder(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Purchase> gerAllPurchaseOrders() {
		return dao.gerAllPurchaseOrders();
	}

}
