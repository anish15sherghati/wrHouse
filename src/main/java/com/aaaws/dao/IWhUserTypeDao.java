package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.WhUserType;

public interface IWhUserTypeDao {
	
	public Integer saveWhUserType(WhUserType obj);

	public List<WhUserType> getAllWhUserType();
	
	public void deleteWhUserTypeById(Integer id);
	
	public WhUserType getWhUserTypeById(Integer id);
	
	public void updateSelectedId(WhUserType obj);

	public List<Object[]> getWhUserTypeCount();
}
