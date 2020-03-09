package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IPurchaseOrderDao;
import com.aaaws.model.PurchaseOrder;

@Repository
public class PurchaseOrderDaoImpl implements IPurchaseOrderDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer savePurchaseOrder(PurchaseOrder part) {
		return (Integer) ht.save(part);
	}

	@Override
	public void deletePurchaseOrder(Integer id) {
		ht.delete(new PurchaseOrder(id));
	}

	@Override
	public List<PurchaseOrder> getAllPurchaseOrders() {
		return ht.loadAll(PurchaseOrder.class);
	}

	@Override
	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return ht.get(PurchaseOrder.class, id);
	}

	@Override
	public void updatePurchaseOrder(PurchaseOrder part) {
		ht.update(part);
	}
}
