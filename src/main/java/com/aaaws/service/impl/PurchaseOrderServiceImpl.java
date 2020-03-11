package com.aaaws.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.IPurchaseOrderDao;
import com.aaaws.model.PurchaseOrder;
import com.aaaws.service.IPurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {
	@Autowired
	private IPurchaseOrderDao dao;

	@Transactional
	public void deletePurchaseOrderById(Integer id) {
		dao.deletePurchaseOrder(id);
	}
	@Transactional(readOnly = true)
	public List<PurchaseOrder> getAllPurchaseOrders() {
		return dao.getAllPurchaseOrders();
	}
	@Transactional(readOnly = true)
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return dao.getOnePurchaseOrder(id);
	}
	@Transactional
	public Integer savePurchaseOrder(PurchaseOrder ob) {
		return dao.savePurchaseOrder(ob);
	}

	@Transactional
	public void updatePurchaseOrder(PurchaseOrder ob) {
		dao.updatePurchaseOrder(ob);
	}
	@Transactional(readOnly = true)
	public List<Object[]> getPurchaseOrderIdAndCode() {
		return dao.getPurchaseOrderIdAndCode();
	}
}
