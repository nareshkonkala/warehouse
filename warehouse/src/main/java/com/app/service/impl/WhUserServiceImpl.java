package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.WhUserDao;
import com.app.model.WhUserType;
import com.app.service.WhUserService;
@Service
public class WhUserServiceImpl implements WhUserService {

	@Autowired
	private WhUserDao dao;
	
	@Transactional
	@Override
	public Integer saveWhUser(WhUserType whobj) {
		return dao.saveWhUser(whobj);
	}

	@Transactional
	@Override
	public void updateWhUser(WhUserType whobj) {

		dao.updateWhUser(whobj);
	}

	@Transactional
	@Override
	public void deleteWhUser(Integer id) {

		dao.deleteWhUser(id);
	}

	@Transactional(readOnly = true)
	@Override
	public WhUserType gerOneWhUser(Integer id) {
		return dao.gerOneWhUser(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<WhUserType> gerAllWhUsers() {
		return dao.gerAllWhUsers();
	}

}
