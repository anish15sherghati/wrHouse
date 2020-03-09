package com.aaaws.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IDocumentDao;
import com.aaaws.model.Document;

@Repository
public class DocumentDaoImpl implements IDocumentDao {

	@Autowired
	private HibernateTemplate ht;

	@Transactional
	public Integer saveDocument(Document doc) {
		return (Integer) ht.save(doc);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getFileIdAndNames() {
		String hql = "select fileId,fileName from com.aaaws.model.Document";
		return (List<Object[]>) ht.find(hql);
	}

	@Override
	public Document getOneDocument(Integer id) {
		return ht.get(Document.class, id);
	}

}
