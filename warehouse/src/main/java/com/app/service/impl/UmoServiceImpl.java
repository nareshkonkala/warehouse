package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUmoDao;
import com.app.model.Umo;
import com.app.service.IUmoService;
@Service
@Transactional
public class UmoServiceImpl implements IUmoService {
	@Autowired
	private IUmoDao dao;

	@Transactional
	@Override
	public Integer saveUmo(Umo umo) {
		return dao.saveUmo(umo);
	}

	@Transactional
	@Override
	public void updateUmo(Umo umo) {

		dao.updateUmo(umo);
	}
	@Transactional
	@Override
	public void deleteUmo(Integer id) {

		dao.deleteUmo(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Umo getOneUmo(Integer id) {
		return dao.getOneUmo(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Umo> getAllUmos() {
		return dao.getAllUmos();
	}

}
