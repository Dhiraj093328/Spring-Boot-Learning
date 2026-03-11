package com.dhiraj.waghmare.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogingAspect {
	
	@Before("execution(* com.dhiraj.waghmare.service.*.*(..))")
	public void logBefore()
	{
		
		System.out.println("Logging before method Execution.....");
	}
	@After("execution(* com.dhiraj.waghmare.service.*.*(..))")
	public void logAfter()
	{
		
		System.out.println(" After method Execution.....");
	}
	@Around("execution(* com.dhiraj.waghmare.service.*.*(..))")
	public void logAround()
	{
		
		System.out.println("Around is fore Before and After");
	}

}
