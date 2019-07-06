package com.app.service;

import java.util.List;

import com.app.model.Grn;

public interface GrnService {

	public Integer saveGrn(Grn grn);
	public void updateGrn(Grn grn);
	public void deleteGrn(Integer id);
	public Grn gerOneGrn(Integer id);
	public List<Grn> getAllGrns();
}
