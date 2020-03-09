package com.aaaws.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaaws.dao.IDocumentDao;
import com.aaaws.model.Document;
import com.aaaws.service.IDocumentService;

@Service
public class DocumentServiceImpl implements IDocumentService {
	
	@Autowired
	private IDocumentDao dao;
	
	@Transactional
	public Integer saveDocument(Document doc) {
		return dao.saveDocument(doc);
	}
	//@Transactional(readOnly=true)
	public List<Object[]> getFileIdAndNames() {
		return dao.getFileIdAndNames();
	}
	
	@Override
	//@Transactional(readOnly=true)
	public Document getOneDocument(Integer id) {
		return dao.getOneDocument(id);
	}
	
	
	
}
