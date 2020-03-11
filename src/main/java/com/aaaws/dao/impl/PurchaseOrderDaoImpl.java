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

	public Integer savePurchaseOrder(PurchaseOrder part) {
		return (Integer) ht.save(part);
	}

	public void deletePurchaseOrder(Integer id) {
		ht.delete(new PurchaseOrder(id));
	}

	public List<PurchaseOrder> getAllPurchaseOrders() {
		return ht.loadAll(PurchaseOrder.class);
	}

	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return ht.get(PurchaseOrder.class, id);
	}

	public void updatePurchaseOrder(PurchaseOrder part) {
		ht.update(part);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getPurchaseOrderIdAndCode() {
		String sql=" select purId, purCode from "+PurchaseOrder.class.getName() +" ";
		return (List<Object[]>) ht.find(sql);
	}
}
