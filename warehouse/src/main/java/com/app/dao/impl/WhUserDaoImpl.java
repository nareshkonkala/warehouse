package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.WhUserDao;
import com.app.model.WhUserType;

@Repository
public class WhUserDaoImpl implements WhUserDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Integer saveWhUser(WhUserType whobj) {
		return (Integer) ht.save(whobj);
	}

	@Override
	public void updateWhUser(WhUserType whobj) {

		ht.update(whobj);
	}

	@Override
	public void deleteWhUser(Integer id) {

		ht.delete(new WhUserType(id));
	}

	@Override
	public WhUserType gerOneWhUser(Integer id) {
		return ht.get(WhUserType.class, id);
	}

	@Override
	public List<WhUserType> gerAllWhUsers() {
		return ht.loadAll(WhUserType.class);
	}

}
