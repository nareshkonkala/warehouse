package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.GrnDao;
import com.app.model.Grn;
@Repository
public class GrnDaoImpl implements GrnDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Integer saveGrn(Grn grn) {
		return (Integer) ht.save(grn);
	}

	@Override
	public void updateGrn(Grn grn) {

		ht.update(grn);
	}

	@Override
	public void deleteGrn(Integer id) {

		ht.delete(new Grn(id));
	}

	@Override
	public Grn gerOneGrn(Integer id) {
		return ht.get(Grn.class, id);
	}

	@Override
	public List<Grn> getAllGrns() {
		return ht.loadAll(Grn.class);
	}

}
