package com.model;

public class MyDao {
	
	private String dbserver;

	public MyDao(String dbserver) {
		super();
		this.dbserver = dbserver;
	}

	@Override
	public String toString() {
		return "MyDao [dbserver=" + dbserver + "]";
	}
	
	

}
