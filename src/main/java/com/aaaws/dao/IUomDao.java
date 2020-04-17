package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.Uom;

public interface IUomDao {

	public	Integer saveUom(Uom uom);

	public List<Uom> getAllUom();
	
	public void deleteUomById(Integer id);
	
	public Uom getOneUomById(Integer id);
	
	public void updateSelectedUom(Uom uom);

	public List<Object[]> getUomTypeCount();

	public List<Object[]> getUomIdAndModel();
	
	public boolean isUomModelExist(String uomModel);
	
	

}
