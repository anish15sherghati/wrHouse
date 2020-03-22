package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.Document;

public interface IDocumentDao {

	Integer saveDocument(Document doc);

	public List<Object[]> getFileIdAndNames();

	Document getOneDocument(Integer id);

}
