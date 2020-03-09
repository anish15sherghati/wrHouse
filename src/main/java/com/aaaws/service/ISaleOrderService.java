package com.aaaws.service;

import java.util.List;

import com.aaaws.model.SaleOrder;

public interface ISaleOrderService {
	public Integer saveSaleOrder(SaleOrder ob);
	public List<SaleOrder> getAllSaleOrder();
	public void deleteSaleOrderById(Integer id);
	public SaleOrder getOneSaleOrder(Integer id);
	public void updateSaleOrder(SaleOrder ob);

}
