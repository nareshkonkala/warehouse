package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUmoDao;
import com.app.model.Umo;
@Repository

public class UmoDaoImpl implements IUmoDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUmo(Umo umo) {
		return (Integer) ht.save(umo);
	}

	@Override
	public void updateUmo(Umo umo) {
		ht.update(umo);
	}

	@Override
	public void deleteUmo(Integer id) {
	
		Umo umo=new Umo();
		umo.setUmoId(id);
		ht.delete(umo);
	}

	@Override
	public Umo getOneUmo(Integer id) {
		return ht.get(Umo.class, id);
	}

	@Override
	public List<Umo> getAllUmos() {
		return ht.loadAll(Umo.class);
	}
	
	@Override
	public boolean isUmoModelExist(String umomodel) {
		long count=0;
		
		String hql="select count(umoModel) from com.app.model.Umo where umoModel=?0";
		
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Long> list=(List<Long>) ht.find(hql, umomodel);
		if(list != null && !list.isEmpty()) {
			count=list.get(0);
		}
		return count !=0 ? true : false ;
	}

}
