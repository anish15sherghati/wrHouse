package com.aaaws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaaws.dao.IShippingDao;
import com.aaaws.model.Shipping;
import com.aaaws.service.IShippingService;

@Service
public class ShippingServiceImpl implements IShippingService {

	@Autowired
	private IShippingDao dao;

	public void deleteShippingById(Integer id) {
		dao.deleteShippingById(id);
	}

	public List<Shipping> getAllShipping() {
		return dao.getAllShipping();
	}

	public Shipping getOneShippingById(Integer id) {
		return dao.getOneShippingById(id);
	}

	public Integer saveShipping(Shipping obj) {
		return dao.saveShipping(obj);
	}

	public void updateSelectedShipping(Shipping obj) {
		dao.updateSelectedShipping(obj);
	}
}
