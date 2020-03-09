package com.aaaws.service;

import java.util.List;

import com.aaaws.model.GoodsRNote;

public interface IGoodsRNoteService {
	public Integer saveGoodsRNote(GoodsRNote obj);

	public List<GoodsRNote> getAllGoodsRNotes();

	public GoodsRNote getOneGoodsRNote(Integer id);

	public void updateGoodsRNote(GoodsRNote obj);

	public void deleteGoodsRNote(Integer id);
}
