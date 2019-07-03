package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveShipmentType(ShipmentType st) {
		
		return (Integer)ht.save(st);
	}

	@Override
	public void updateShipmentType(ShipmentType st) {
		
		 ht.update(st);
	}

	@Override
	public void deleteShipmentType(Integer id) {
		ShipmentType st=new ShipmentType();
		st.setStId(id);
		ht.delete(st);

	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}

	@Override
	public List<ShipmentType> getAllShipmentTypes() {
		
		return  ht.loadAll(ShipmentType.class);
	}

	@Override
	public List<Object[]> getShipmentTypeModeCount() {

		String hql="select stMode,count(stMode) "
				+"from com.app.model ShipmentType "+""
				+ "group by stMode ";
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Object[]> list=(List<Object[]>) ht.find(hql);
		
		return list;
	}

}
