package com.config.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/config/annotations/spring.xml");
		
		Instructor instructor=(Instructor)context.getBean("inst");
		System.out.println(" hashCode : "+instructor.hashCode());
		System.out.println(instructor);


		Instructor instructor2=(Instructor)context.getBean("inst");
		System.out.println("\n hashCode : "+instructor2.hashCode());
		System.out.println(instructor2);

	}

}
