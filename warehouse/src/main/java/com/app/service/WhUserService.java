package com.app.service;

import java.util.List;

import com.app.model.WhUserType;

public interface WhUserService {

	public Integer saveWhUser(WhUserType whobj);
	public void updateWhUser(WhUserType whobj);
	public void deleteWhUser(Integer id);
	
	public WhUserType gerOneWhUser(Integer id);
	public List<WhUserType> gerAllWhUsers();
	
	public List<WhUserType> getAllUserType(String whType);
}
