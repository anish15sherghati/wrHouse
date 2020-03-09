package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.Shipping;

public interface IShippingDao {

	public Integer saveShipping(Shipping obj);

	public List<Shipping> getAllShipping();

	public void deleteShippingById(Integer id);

	public Shipping getOneShippingById(Integer id);

	public void updateSelectedShipping(Shipping obj);

}
