package com.training.aop.loggingAround;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class LoggingAspectAround {
	
	
	@Around("execution(public * get*())")
	public Object sampleMyAroundAdvice(ProceedingJoinPoint proceedingJointPoint)
	{
		Object retVal=null;
		try
		{
			System.out.println("before job goes here");
			retVal=proceedingJointPoint.proceed();
			System.out.println("after job goes here");
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		return retVal;
	}

}
