package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.Parts;

public interface IPartsDao {

	public Integer savePart(Parts part);
	public List<Parts> getAllParts();
	public Parts getOnePart(Integer id);
	public void updatePart(Parts part);
	public void deletePart(Integer id);
	
	List<Object[]> getOrderIdAndMode(String mode);
}
