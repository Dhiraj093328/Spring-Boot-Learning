package com.example.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
public class HibernetConfig {
	@Bean
	public DataSource datasource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/dhiraj");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
	}
	
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(datasource());
		factory.setPackagesToScan("com.example.model");
		return factory;
	}

}
