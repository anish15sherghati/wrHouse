package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IShippingDao;
import com.aaaws.model.Shipping;

@Repository
public class ShippingDaoImpl implements IShippingDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveShipping(Shipping obj) {
		return (Integer) ht.save(obj);
	}

	public List<Shipping> getAllShipping() {
		return ht.loadAll(Shipping.class);
	}

	public void deleteShippingById(Integer id) {
		ht.delete(new Shipping(id));
	}

	public Shipping getOneShippingById(Integer id) {
		return ht.get(Shipping.class, id);
	}

	public void updateSelectedShipping(Shipping obj) {
		ht.update(obj);
	}

}
