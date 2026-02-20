package com.dhiraj.waghmare.externaliztion.SpringExternalization;

public class MyDao {
	private String dbsource;

	public MyDao(String dbsource) {
		super();
		this.dbsource = dbsource;
	}

	@Override
	public String toString() {
		return "MyDao [dbsource=" + dbsource + "]";
	}

}
