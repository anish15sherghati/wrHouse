package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IUomDao;
import com.aaaws.model.Uom;

@Repository
public class UomDaoImpl implements IUomDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer saveUom(Uom uom) {
		return (Integer) ht.save(uom);
	}

	public List<Uom> getAllUom() {
		return ht.loadAll(Uom.class);
	}

	public void deleteUomById(Integer id) {
		Uom uom = new Uom();
		uom.setUomId(id);
		ht.delete(uom);
	}

	public Uom getOneUomById(Integer id) {
		return ht.get(Uom.class, id);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Object[]> getUomTypeCount() {
		String sql = "select uomType, count(uomType) from com.aaaws.model.Uom group by uomType";
		return (List<Object[]>) ht.find(sql);
	}

	public void updateSelectedUom(Uom uom) {
		ht.update(uom);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getUomIdAndModel() {
		String sql = " select uomId, uomModel from com.aaaws.model.Uom ";
		return (List<Object[]>) ht.find(sql);
	}
}
