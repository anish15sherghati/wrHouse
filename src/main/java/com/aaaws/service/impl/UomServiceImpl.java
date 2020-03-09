package com.aaaws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.IUomDao;
import com.aaaws.model.Uom;
import com.aaaws.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {

	@Autowired
	private IUomDao dao;
	
	@Override
	@Transactional
	public Integer saveUom(Uom uom) {
		return dao.saveUom(uom);
	}

	@Override
	public List<Uom> getAllUom() {
		return dao.getAllUom();
		
	}
	@Override
	@Transactional
	public void deleteUomById(Integer id) {
		dao.deleteUomById(id);
	}
	@Override
	public Uom getOneUomById(Integer id) {
		return dao.getOneUomById(id);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Object[]> getUomTypeCount() {
		return dao.getUomTypeCount();
	}
	
	@Override
	@Transactional
	public void updateSelectedUom(Uom uom) {
		dao.updateSelectedUom(uom);
	}
	
	public List<Object[]> getUomIdAndModel() {
		return dao.getUomIdAndModel();
	}
	
	
	
}
