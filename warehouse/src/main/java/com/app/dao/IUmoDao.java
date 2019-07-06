package com.app.dao;

import java.util.List;

import com.app.model.Umo;

public interface IUmoDao {

	public Integer saveUmo(Umo umo);
	public void updateUmo(Umo umo);
	public void deleteUmo(Integer id);
	public Umo getOneUmo(Integer id);
	public List<Umo> getAllUmos();
	
	public boolean isUmoModelExist(String umoModel);
}
