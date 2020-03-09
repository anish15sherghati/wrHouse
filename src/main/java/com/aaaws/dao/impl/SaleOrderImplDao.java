package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.ISaleOrderDao;
import com.aaaws.model.SaleOrder;

@Repository
public class SaleOrderImplDao implements ISaleOrderDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public void deleteSaleOrderById(Integer id) {
		ht.delete(new SaleOrder(id));
	}

	@Override
	public List<SaleOrder> getAllSaleOrder() {
		return ht.loadAll(SaleOrder.class);
	}

	@Override
	public SaleOrder getOneSaleOrder(Integer id) {
		return ht.get(SaleOrder.class, id);
	}

	@Override
	public Integer saveSaleOrder(SaleOrder ob) {
		return (Integer) ht.save(ob);
	}

	@Override
	public void updateSaleOrder(SaleOrder ob) {
		ht.update(ob);
	}
}
