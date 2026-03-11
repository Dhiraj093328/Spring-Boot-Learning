package com.dhiraj.waghmare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dhiraj.waghmare.AppConfig;
import com.dhiraj.waghmare.service.PaymentService;

public class DemoApplication {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PaymentService service=context.getBean(PaymentService.class);
		service.processPayment();

	}

}
