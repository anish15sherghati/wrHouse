package com.aaaws.service;

import java.util.List;

import com.aaaws.model.OrderMethod;

public interface IOrderMethodService {

	public Integer saveOrderMethod(OrderMethod orderMethod);

	public OrderMethod getOneOrderMethod(Integer id);

	public List<OrderMethod> getAllOrderMethod();

	public void deleteById(Integer id);

	void updateSelectedOrder(OrderMethod obj);

	List<Object[]> getOrderModeCount();
	public List<Object[]> getOrderIdAndMode(String mode);

}
