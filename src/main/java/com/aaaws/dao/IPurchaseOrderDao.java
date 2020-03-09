package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.PurchaseOrder;


public interface IPurchaseOrderDao {

	public Integer savePurchaseOrder(PurchaseOrder obj);

	public List<PurchaseOrder> getAllPurchaseOrders();

	public PurchaseOrder getOnePurchaseOrder(Integer id);

	public void updatePurchaseOrder(PurchaseOrder obj);

	public void deletePurchaseOrder(Integer id);
}
