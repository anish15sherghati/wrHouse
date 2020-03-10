package com.aaaws.dao;

import java.util.List;

import com.aaaws.model.OrderMethod;

public interface IOrderMethodDao {
	public Integer saveOrderMethod(OrderMethod orderMethod);

	public OrderMethod getOneOrderMethod(Integer id);

	public List<OrderMethod> getAllOrderMethod();

	public void deleteById(Integer id);

	void updateSelectedOrder(OrderMethod obj);

	List<Object[]> getOrderModeCount();

	List<Object[]> getOrderIdAndCode(String mode);

}
