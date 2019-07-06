package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.PurchaseDao;
import com.app.model.Purchase;

@Repository
public class PurchaseDaoImpl implements PurchaseDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveOrder(Purchase pob) {
		return (Integer) ht.save(pob);
	}

	@Override
	public void updatePurchaseOrder(Purchase pob) {

		ht.update(pob);
	}

	@Override
	public void deletePurchaseOrder(Integer id) {

		ht.delete(new Purchase(id));
	}

	@Override
	public Purchase getOnePurchaseOrder(Integer id) {
		return ht.get(Purchase.class, id);
	}

	@Override
	public List<Purchase> gerAllPurchaseOrders() {
		return ht.loadAll(Purchase.class);
	}

	

}
