package com.config.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Oi")
public class OrderImpl implements OrderInterfaces {
	
	@Autowired
	@Qualifier
	private OrderDaoInterface dao;
	
	
	public OrderDaoInterface getDao() {
		return dao;
	}

	public void setDao(OrderDaoInterface dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		
		System.out.println("Inside Order Impl Class");
		dao.createOrder();
		
	}
	
	

}
