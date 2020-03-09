package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaaws.dao.IOrderMethodDao;
import com.aaaws.model.OrderMethod;

@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer saveOrderMethod(OrderMethod orderMethod) {
		return (Integer) ht.save(orderMethod);
	}

	public OrderMethod getOneOrderMethod(Integer id) {
		return ht.get(OrderMethod.class, id);
	}

	public List<OrderMethod> getAllOrderMethod() {
		return ht.loadAll(OrderMethod.class);
	}

	public void deleteById(Integer id) {
		ht.delete(new OrderMethod(id));
	}

	public void updateSelectedOrder(OrderMethod obj) {
		ht.update(obj);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getOrderModeCount() {
		String hql = "select ordMode,count(ordMode) from com.aaaws.model.OrderMethod group by ordMode";
		return (List<Object[]>) ht.find(hql);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getOrderIdAndMode(String mode) {
		String sql = " select ordId, ordMode from com.aaaws.model.OrderMethod where ordMode=?0 ";
		return (List<Object[]>) ht.find(sql, mode);
	}

}
