package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IShipmentTypeDao;
import com.aaaws.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {

	@Autowired
	private HibernateTemplate ht;
	
	public Integer saveShipmentType(ShipmentType ob) {
		return (Integer)ht.save(ob);
	}	
	
	public List<ShipmentType> getAllShipmentTypes() {
		return ht.loadAll(ShipmentType.class);
	}
	
	public void deleteShipmentTypeById(Integer id) {
		ht.delete(new ShipmentType(id));		
	}
	
	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}
	
	public void updateShipmentType(ShipmentType ob) {
		ht.update(ob);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getShipmentModeCount() {
		String hql="select shipMode, count(shipMode) from"
				+ " com.aaaws.model.ShipmentType group by shipMode";
		
		return (List<Object[]>) ht.find(hql);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getShipmentIdAndCode() {
		String sql= " select shipId, shipCode from   com.aaaws.model.ShipmentType ";
		return (List<Object[]>) ht.find(sql);
	}
}
