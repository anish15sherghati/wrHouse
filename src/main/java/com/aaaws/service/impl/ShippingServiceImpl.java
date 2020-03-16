package com.aaaws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaaws.dao.IShippingDao;
import com.aaaws.model.Shipping;
import com.aaaws.service.IShippingService;

@Service
public class ShippingServiceImpl implements IShippingService {

	@Autowired
	private IShippingDao dao;

	@Transactional
	public void deleteShippingById(Integer id) {
		dao.deleteShippingById(id);
	}

	@Transactional(readOnly = true)
	public List<Shipping> getAllShipping() {
		return dao.getAllShipping();
	}

	@Transactional(readOnly = true)
	public Shipping getOneShippingById(Integer id) {
		return dao.getOneShippingById(id);
	}

	@Transactional
	public Integer saveShipping(Shipping obj) {
		return dao.saveShipping(obj);
	}

	@Transactional
	public void updateSelectedShipping(Shipping obj) {
		dao.updateSelectedShipping(obj);
	}
}
