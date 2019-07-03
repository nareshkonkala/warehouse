package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IDocumentDao;
import com.app.model.Document;
import com.app.service.IDocumentService;
@Service
public class DocumentServiceImpl implements IDocumentService {

	
	@Autowired
	private IDocumentDao dao;
	
	@Transactional
	@Override
	public Integer saveDocument(Document doc) {
		
		return dao.saveDocument(doc);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Object[]> getFileIdAndNames() {
		
		return dao.getFileIdAndNames();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Document getOneDocument(Integer id) {
		
		return dao.getOneDocument(id);
	}
}
