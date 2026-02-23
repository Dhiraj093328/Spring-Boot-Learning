package com.dhiraj.waghmare.SpringJDBCTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/dhiraj/waghmare/SpringJDBCTest/spring.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

		String sql = "INSERT INTO employee (id, firstname, lastname) VALUES (?, ?, ?)";

		int result = jdbcTemplate.update(sql, 1, "Dhiraj", "Waghmare");

		System.out.println("Number of records inserted: " + result);
	}
}