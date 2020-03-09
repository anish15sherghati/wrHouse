package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IGoodsRNoteDao;
import com.aaaws.model.GoodsRNote;

@Repository
public class GoodsRNoteDaoImpl implements IGoodsRNoteDao {
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public void deleteGoodsRNote(Integer id) {
		ht.delete(new GoodsRNote(id));
	}

	@Override
	public List<GoodsRNote> getAllGoodsRNotes() {
		return ht.loadAll(GoodsRNote.class);
	}

	@Override
	public GoodsRNote getOneGoodsRNote(Integer id) {
		return ht.get(GoodsRNote.class, id);
	}

	@Override
	public Integer saveGoodsRNote(GoodsRNote obj) {
		return (Integer) ht.save(obj);
	}

	@Override
	public void updateGoodsRNote(GoodsRNote obj) {
		ht.update(obj);
	}
}
