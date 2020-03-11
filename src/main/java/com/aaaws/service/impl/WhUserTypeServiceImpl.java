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
	
	@Transactional
	public Integer saveWhUserType(WhUserType obj) {
		return dao.saveWhUserType(obj);
	}

	@Transactional(readOnly = true)
	public List<WhUserType> getAllWhUserType() {
		return dao.getAllWhUserType();
	}
	
	@Transactional
	public void deleteWhUserTypeById(Integer id) {
		dao.deleteWhUserTypeById(id);
	}
	@Transactional(readOnly = true)
	public WhUserType getWhUserTypeById(Integer id) {
		return dao.getWhUserTypeById(id);
	}

	@Transactional
	public void updateSelectedId(WhUserType obj) {
		dao.updateSelectedId(obj);
	}
	@Transactional(readOnly = true)
	public List<Object[]> getWhUserTypeCount() {
		return dao.getWhUserTypeCount();
	}
	@Transactional(readOnly = true)
	public List<Object[]> getWhUserTypeIdAndCode(String whuserType) {
		return dao.getWhUserTypeIdAndCode(whuserType);
	}
	
}
