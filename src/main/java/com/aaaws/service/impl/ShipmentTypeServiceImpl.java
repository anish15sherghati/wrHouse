package com.aaaws.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.IShipmentTypeDao;
import com.aaaws.model.ShipmentType;
import com.aaaws.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private IShipmentTypeDao dao;

	@Transactional
	public Integer saveShipmentType(ShipmentType ob) {
		return dao.saveShipmentType(ob);
	}

	@Transactional(readOnly = true)
	public List<ShipmentType> getAllShipmentTypes() {
		List<ShipmentType> lists = dao.getAllShipmentTypes();
		Collections.sort(lists, (o1, o2) -> o1.getShipId() - o2.getShipId());
		return lists;
	}

	@Transactional
	public void deleteShipmentTypeById(Integer id) {
		dao.deleteShipmentTypeById(id);
	}

	public ShipmentType getOneShipmentType(Integer id) {
		return dao.getOneShipmentType(id);
	}

	@Transactional
	public void updateShipmentType(ShipmentType ob) {
		dao.updateShipmentType(ob);
	}

	public List<Object[]> getShipmentModeCount() {
		return dao.getShipmentModeCount();
	}
	
	@Transactional(readOnly = true)
	public List<Object[]> getShipmentIdAndCode() {
		return dao.getShipmentIdAndCode();
	}
}
