package com.config.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
//For Integer
	//@Value("101")
	//@Value("#{4+2}")
	//@Value("#{T(java.lang.Integer).MIN_VALUE}")
	//@Value("#{new Integer(88)}")
	@Value("#{T(java.lang.Math).abs(-99)}")
	private int id;


//For String
	//@Value("Dhiraj")
	//@Value("#{'Dhiraj Waghmare'}")
	//@Value("#{new java.lang.String('Dhiraj Waghmare')}")
	//@Value("#{'Dhiraj Waghmare'.toUpperCase()}")
	@Value("#{'Dhiraj Waghmare'.toLowerCase()}")

	private String name;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile Profile;
	
	//@Value("#{(2+4>5)}")
	@Value("#{(2+4>8?false:true)}")
	private boolean active;

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

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", Profile=" + Profile + ", active="
				+ active + "]";
	}

	
	
	
}
