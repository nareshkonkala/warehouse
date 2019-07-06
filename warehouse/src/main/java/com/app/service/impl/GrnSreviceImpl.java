package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.GrnDao;
import com.app.model.Grn;
import com.app.service.GrnService;

@Service
public class GrnSreviceImpl implements GrnService {

	
	@Autowired
	private GrnDao dao;
	
	@Transactional
	@Override
	public Integer saveGrn(Grn grn) {
		return dao.saveGrn(grn);
	}

	@Transactional
	@Override
	public void updateGrn(Grn grn) {

		dao.updateGrn(grn);
	}

	@Transactional
	@Override
	public void deleteGrn(Integer id) {

		dao.deleteGrn(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Grn gerOneGrn(Integer id) {

		return dao.gerOneGrn(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Grn> getAllGrns() {
		return dao.getAllGrns();
	}

}
