package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IDocumentDao;
import com.app.model.Document;
@Repository
public class DocumentDaoImpl implements IDocumentDao{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveDocument(Document doc) {
		return (Integer) ht.save(doc);
	}

	@Override
	public List<Object[]> getFileIdAndNames() {
		String hql="select fileId,fileName from com.app.model.Document";
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Object[]> list=(List<Object[]>) ht.find(hql);
		return list;
	}
	
	@Override
	public Document getOneDocument(Integer id) {
		return ht.get(Document.class, id);
	}
}
