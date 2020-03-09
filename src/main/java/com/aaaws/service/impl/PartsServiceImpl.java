package com.aaaws.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.IPartsDao;
import com.aaaws.model.Parts;
import com.aaaws.service.IPartsService;

@Service
public class PartsServiceImpl implements IPartsService {
	@Autowired
	private IPartsDao dao;

	@Override
	@Transactional
	public Integer savePart(Parts part) {
		return dao.savePart(part);
	}

	@Transactional
	public void deletePart(Integer id) {
		dao.deletePart(id);
	}

	public List<Parts> getAllParts() {
		return dao.getAllParts();
	}
	public Parts getOnePart(Integer id) {
		return dao.getOnePart(id);
	}

	
	@Transactional
	public void updatePart(Parts part) {
		dao.updatePart(part);
	}

	@Transactional(readOnly = true)
	public List<Object[]> getOrderIdAndMode(String mode) {
		return dao.getOrderIdAndMode(mode);
	}
}
