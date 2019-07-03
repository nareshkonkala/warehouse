package com.app.dao;

import java.util.List;

import com.app.model.WhUserType;

public interface WhUserDao {
	
	public Integer saveWhUser(WhUserType whobj);
	public void updateWhUser(WhUserType whobj);
	public void deleteWhUser(Integer id);
	
	public WhUserType gerOneWhUser(Integer id);
	public List<WhUserType> gerAllWhUsers();

}
