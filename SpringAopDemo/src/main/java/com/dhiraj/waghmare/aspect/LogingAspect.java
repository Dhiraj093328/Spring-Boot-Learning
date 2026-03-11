package com.dhiraj.waghmare.aspect;

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

}
