package com.training.aop.banking;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
//will scan for any package or any class
	//@Before("execution(public double getBalance())")
	
	
	
	
	//with fully qualified name
	//@Before("execution(public double com.training.aop.model.CAAccount.getBalance())")
	//log all getters
	//@Before("execution( * get*())")
	
	
	//getters which either takes the param or not
	//@Before("execution(* get*(..))")
	
	
	
	//@Before("execution(com.training.aop.model.*.getBalance())")
	public void loggingAdviceBefore()
	{
		System.out.println("***********Logging Before called***************");
	}
	
	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("second aspect invoked for all getters");
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters()
	{
		System.out.println("this data should not be displayed");
	}
	@Pointcut("execution(com.training.aop.model.SBAccount.get*()")
	public void allSbAccountGetters()
	{
		
	}
	
	
	//@Before("allSbAccountGetters()")
	//{
		
//	}
}
