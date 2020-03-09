package com.aaaws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.IOrderMethodDao;
import com.aaaws.model.OrderMethod;
import com.aaaws.service.IOrderMethodService;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
	@Autowired
	private IOrderMethodDao dao;

	@Transactional
	public Integer saveOrderMethod(OrderMethod orderMethod) {
		return dao.saveOrderMethod(orderMethod);
	}

	public OrderMethod getOneOrderMethod(Integer id) {
		return dao.getOneOrderMethod(id);
	}

	public List<OrderMethod> getAllOrderMethod() {
		return dao.getAllOrderMethod();
	}

	@Transactional
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public List<Object[]> getOrderModeCount() {
		return dao.getOrderModeCount();
	}

	@Transactional
	public void updateSelectedOrder(OrderMethod obj) {
		dao.updateSelectedOrder(obj);
	}

	@Transactional(readOnly = true)
	public List<Object[]> getOrderIdAndMode(String mode) {
		return dao.getOrderIdAndMode(mode);
	}

}
