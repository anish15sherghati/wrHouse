package com.aaaws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.ISaleOrderDao;
import com.aaaws.model.SaleOrder;
import com.aaaws.service.ISaleOrderService;

@Service
public class SaleOrderServiceImpl implements ISaleOrderService {
	@Autowired
	private ISaleOrderDao dao;

	@Transactional
	public void deleteSaleOrderById(Integer id) {
		dao.deleteSaleOrderById(id);
	}

	public List<SaleOrder> getAllSaleOrder() {
		return dao.getAllSaleOrder();
	}

	@Override
	public SaleOrder getOneSaleOrder(Integer id) {
		return dao.getOneSaleOrder(id);
	}

	@Transactional
	public Integer saveSaleOrder(SaleOrder ob) {
		return dao.saveSaleOrder(ob);
	}

	@Transactional
	public void updateSaleOrder(SaleOrder ob) {
		dao.updateSaleOrder(ob);
	}
}
