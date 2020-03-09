package com.aaaws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.IWhUserTypeDao;
import com.aaaws.model.WhUserType;
import com.aaaws.service.IWhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {

	@Autowired
	private IWhUserTypeDao dao;
	
	@Override
	@Transactional
	public Integer saveWhUserType(WhUserType obj) {
		return dao.saveWhUserType(obj);
	}

	@Override
	@Transactional(readOnly = true)
	public List<WhUserType> getAllWhUserType() {
		return dao.getAllWhUserType();
	}
	
	@Override
	@Transactional
	public void deleteWhUserTypeById(Integer id) {
		dao.deleteWhUserTypeById(id);
	}
	@Override
	public WhUserType getWhUserTypeById(Integer id) {
		return dao.getWhUserTypeById(id);
	}

	@Override
	@Transactional
	public void updateSelectedId(WhUserType obj) {
		dao.updateSelectedId(obj);
	}

	@Override
	public List<Object[]> getWhUserTypeCount() {
		return dao.getWhUserTypeCount();
	}
}
