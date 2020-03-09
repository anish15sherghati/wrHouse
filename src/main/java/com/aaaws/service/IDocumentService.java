package com.aaaws.service;

import java.util.List;

import com.aaaws.model.Document;

public interface IDocumentService {

	Integer saveDocument(Document doc);
	
	public List<Object[]> getFileIdAndNames();
	
    Document getOneDocument(Integer id);
}
