package com.app.dao;

import java.util.List;

import com.app.model.Grn;

public interface GrnDao {;
	
	public Integer saveGrn(Grn grn);
	public void updateGrn(Grn grn);
	public void deleteGrn(Integer id);
	public Grn gerOneGrn(Integer id);
	public List<Grn> getAllGrns();

}
