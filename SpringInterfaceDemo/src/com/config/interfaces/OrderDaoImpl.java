package com.config.interfaces;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDaoImpl implements OrderDaoInterface {

	@Override
	public void createOrder() {
		System.out.println("Inside Order Dao Impl Class");
	}

}
