package com.aaaws.service;

import java.util.List;

import com.aaaws.model.ShipmentType;

public interface IShipmentTypeService {

	public Integer saveShipmentType(ShipmentType ob);
	
	public List<ShipmentType> getAllShipmentTypes();
	
	public void deleteShipmentTypeById(Integer id);
	
	public ShipmentType getOneShipmentType(Integer id);
	
	public void updateShipmentType(ShipmentType ob);
	public List<Object[]> getShipmentModeCount();
	
	public List<Object[]> getShipmentIdAndCode() ;
}
