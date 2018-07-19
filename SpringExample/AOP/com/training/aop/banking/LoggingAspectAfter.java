package com.training.aop.banking;

import javax.management.RuntimeErrorException;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class LoggingAspectAfter {
@After("execution(* get*())")
public void afterGetter()
{
	System.out.println("***************advice invoked*************");
}


@AfterReturning("execution(* com.training.aop.model.SBAccount.getAcc())")
public void aftersuccessfulGetter()
{
	System.out.println("after returning from getters");
}

@AfterReturning(pointcut="args(val)",returning="returnVal")
public void afterReturnStringSetter(String val,String returnVal)
{
	System.out.println("after invoked for input->"+val+",return->"+returnVal);
}


@AfterThrowing("execution(* throw*())")
public void afterException()
{
System.out.println("this all is invoked for exception");	
}


}
