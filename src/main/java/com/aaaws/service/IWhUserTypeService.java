package com.aaaws.service;

import java.util.List;

import com.aaaws.model.WhUserType;

public interface IWhUserTypeService {

	public Integer saveWhUserType(WhUserType obj);
	
	public List<WhUserType> getAllWhUserType();
	
	public void deleteWhUserTypeById(Integer id);
	
	public WhUserType getWhUserTypeById(Integer id);
	
	public void updateSelectedId(WhUserType obj);
	
	public List<Object[]> getWhUserTypeCount();
	
	public List<Object[]> getWhUserTypeIdAndCode(String whuserType);
}
