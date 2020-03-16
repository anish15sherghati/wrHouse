package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.SaleOrder;

public interface ISaleOrderDao {

	public Integer saveSaleOrder(SaleOrder ob);
	public List<SaleOrder> getAllSaleOrder();
	public void deleteSaleOrderById(Integer id);
	public SaleOrder getOneSaleOrder(Integer id);
	public void updateSaleOrder(SaleOrder ob);
	
	
}
