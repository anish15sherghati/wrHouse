package com.aaaws.service;

import java.util.List;

import com.aaaws.model.PurchaseOrder;


public interface IPurchaseOrderService {

	public Integer savePurchaseOrder(PurchaseOrder ob);
	
	public List<PurchaseOrder> getAllPurchaseOrders();
	
	public void deletePurchaseOrderById(Integer id);
	
	public PurchaseOrder getOnePurchaseOrder(Integer id);
	
	public void updatePurchaseOrder(PurchaseOrder ob);
}
