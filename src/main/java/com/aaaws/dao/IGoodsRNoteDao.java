package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.GoodsRNote;


public interface IGoodsRNoteDao {

	public Integer saveGoodsRNote(GoodsRNote obj);

	public List<GoodsRNote> getAllGoodsRNotes();

	public GoodsRNote getOneGoodsRNote(Integer id);

	public void updateGoodsRNote(GoodsRNote obj);

	public void deleteGoodsRNote(Integer id);
}
