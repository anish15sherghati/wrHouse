package com.aaaws.service;

import java.util.List;

import com.aaaws.model.Parts;

public interface IPartsService {

	public Integer savePart(Parts part);
	public List<Parts> getAllParts();
	public Parts getOnePart(Integer id);
	public void updatePart(Parts part);
	public void deletePart(Integer id);
	public List<Object[]> getOrderIdAndMode(String mode);
}
