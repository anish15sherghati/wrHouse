package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IPartsDao;
import com.aaaws.model.Parts;

@Repository
public class PartsDaoImpl implements IPartsDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer savePart(Parts part) {
		return (Integer) ht.save(part);
	}

	public void deletePart(Integer id) {
		ht.delete(new Parts(id));
	}

	public List<Parts> getAllParts() {
		return ht.loadAll(Parts.class);
	}

	public Parts getOnePart(Integer id) {
		return ht.get(Parts.class, id);
	}

	public void updatePart(Parts part) {
		ht.update(part);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Object[]> getOrderIdAndMode(String mode) {
		String sql= " SELECT ORDID, ORDMODE FROM COM.AAAWS.MODEL.ORDERMETHOD WHERE ORDID=?0 ";
		return (List<Object[]>) ht.find(sql, mode);
	}
	
}
