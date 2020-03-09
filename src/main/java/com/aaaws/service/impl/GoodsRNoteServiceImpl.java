package com.aaaws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaaws.dao.IGoodsRNoteDao;
import com.aaaws.model.GoodsRNote;
import com.aaaws.service.IGoodsRNoteService;

@Service
public class GoodsRNoteServiceImpl implements IGoodsRNoteService {
	
	@Autowired
	private IGoodsRNoteDao dao;

	public void deleteGoodsRNote(Integer id) {
		dao.deleteGoodsRNote(id);
	}

	public List<GoodsRNote> getAllGoodsRNotes() {
		return dao.getAllGoodsRNotes();
	}

	public GoodsRNote getOneGoodsRNote(Integer id) {
		return dao.getOneGoodsRNote(id);
	}

	public Integer saveGoodsRNote(GoodsRNote obj) {
		return dao.saveGoodsRNote(obj);
	}

	public void updateGoodsRNote(GoodsRNote obj) {
		dao.updateGoodsRNote(obj);
	}
}
