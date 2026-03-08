package com.waghmare.dhiraj.dao;

public class User {
	private int id;
	private String name;
	private String Email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Email=" + Email + "]";
	}
	
	
	
}